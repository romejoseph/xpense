package com.rjrs.xpense.controller;

import com.rjrs.xpense.dto.CreateExpenseRequest;
import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
            e.printStackTrace();
            throw e;
        }
    }
}
