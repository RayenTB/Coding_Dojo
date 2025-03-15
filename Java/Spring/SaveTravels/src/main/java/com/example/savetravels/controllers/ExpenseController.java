package com.example.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.savetravels.models.Expense;
import com.example.savetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;


	@GetMapping("")
	public String home(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}

	@PostMapping("/addExpense")
	public String home(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Expense> expenses = expenseService.allExpenses();
			model.addAttribute("expenses", expenses);
			return "index.jsp";
		}
		expenseService.createExpense(expense);
		return "redirect:/";
	}

	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		return "edit.jsp";
	}

	@RequestMapping(value = "/editExpense/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("expense", expense);
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/deleteExpense/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
		return "redirect:/";
	}
	
	@RequestMapping("/expenses/{id}")
	public String showOne(Model model, @PathVariable("id") Long id) {
		Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		System.out.println(expense); // just to show my console

		return "showOne.jsp";
	}


}