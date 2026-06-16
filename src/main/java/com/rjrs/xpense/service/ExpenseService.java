package com.rjrs.xpense.service;

import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.entity.ExpenseCategory;
import com.rjrs.xpense.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
class ExpenseService {
    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public Expense createExpense(String description, BigDecimal amount, ExpenseCategory category, LocalDate expensedate) {
        return this.repo.save(new Expense(description, amount, category, expensedate));
    }

    public List<Expense> getAllExpenses() {
        return this.repo.findAll();
    }

    public void deleteExpense(UUID uuid) {
        this.repo.deleteById(uuid);
    }
}
