package com.example.savetravels.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.savetravels.models.Expense;

@Repository
public interface ExpenseRespsitory extends CrudRepository<Expense, Long>{
	List<Expense> findAll();
    List<Expense> findByDescriptionContaining(String search);
    Long countByNameContaining(String search);
    Long deleteByNameStartingWith(String search);
}