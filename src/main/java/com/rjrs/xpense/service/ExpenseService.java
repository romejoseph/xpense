package com.rjrs.xpense.service;

import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.entity.ExpenseCategory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public interface ExpenseService {
    Expense createExpense(String description, BigDecimal amount, ExpenseCategory category, LocalDate expenseDate);

    List<Expense> getAllExpenses();

    void deleteExpense(UUID uuid);
}
