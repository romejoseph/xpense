package com.rjrs.xpense.service;

import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.entity.ExpenseCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public interface ExpenseService {
    Expense createExpense(String description, BigDecimal amount, ExpenseCategory category, LocalDate expenseDate);

    Page<Expense> getAllExpenses(Pageable pageable);

    Expense getExpenseByUUID(UUID uuid);

    void deleteExpense(UUID uuid);
}
