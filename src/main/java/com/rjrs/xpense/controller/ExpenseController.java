package com.rjrs.xpense.controller;

import com.rjrs.xpense.dto.CreateExpenseRequest;
import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.exception.ExpenseNotFoundException;
import com.rjrs.xpense.service.ExpenseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping("/expenses")
class ExpenseController {
    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Expense createExpense(@RequestBody CreateExpenseRequest expense) {
        try {
            return this.service.createExpense(expense.description(), expense.amount(), expense.category(), expense.expenseDate());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping
    public Page<Expense> getAllExpenses(Pageable pageable) {
        try {
            return this.service.getAllExpenses(pageable);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{uuid}")
    public Expense getExpense(@PathVariable UUID uuid) {
        try {
            return this.service.getExpenseByUUID(uuid);
        } catch (NoSuchElementException e) {
            throw new ExpenseNotFoundException(e.getMessage());
        }
    }

    @DeleteMapping("/{uuid}")
    public void deleteExpense(@PathVariable UUID uuid) {
        try {
            this.service.deleteExpense(uuid);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
