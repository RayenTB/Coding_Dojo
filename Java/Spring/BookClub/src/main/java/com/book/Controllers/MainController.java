package com.book.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.book.Models.Book;
import com.book.Models.LoginUser;
import com.book.Models.User;
import com.book.Services.BookService;
import com.book.Services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    @Autowired
    private BookService bookService;

    // Home page
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    // Register
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
        User user = userService.register(newUser, result);
        if (result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/books";
    }

    // Login
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
        User user = userService.login(newLogin, result);
        if (result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/books";
    }

    // View all books
    @GetMapping("/books")
    public String books(Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        model.addAttribute("books", bookService.all());
        model.addAttribute("user", userService.findById((Long) session.getAttribute("userId")));
        return "books.jsp";
    }

    // New Book form
    @GetMapping("/newBook")
    public String newBook(@ModelAttribute("book") Book book, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        model.addAttribute("user", userService.findById((Long) session.getAttribute("userId")));
        return "newBook.jsp";
    }

    // Create Book
    @PostMapping("/books")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userService.findById((Long) session.getAttribute("userId")));
            return "newBook.jsp";
        }
        Long userId = (Long) session.getAttribute("userId");
        User user = userService.findById(userId);
        book.setUser(user);
        bookService.create(book);
        return "redirect:/books";
    }

    // View one book (Show Page)
    @GetMapping("/books/{id}")
    public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        Book book = bookService.findOne(id);
        model.addAttribute("book", book);
        return "showBook.jsp";
    }

    // Edit form (GET)
    @GetMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        Book book = bookService.findOne(id);
        model.addAttribute("book", book);
        model.addAttribute("user", userService.findById((Long) session.getAttribute("userId")));
        return "editBook.jsp";
    }

    // Update book (PUT)
    @PutMapping("/books/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, Model model, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        if (result.hasErrors()) {
            model.addAttribute("user", userService.findById((Long) session.getAttribute("userId")));
            return "editBook.jsp";
        }
        bookService.update(book);
        return "redirect:/books";
    }

    // Delete book
    @DeleteMapping("/books/delete/{id}")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        bookService.delete(id);
        return "redirect:/books";
    }

    // Logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
