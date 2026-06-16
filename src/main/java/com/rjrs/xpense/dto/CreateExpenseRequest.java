package com.rjrs.xpense.dto;

import com.rjrs.xpense.entity.ExpenseCategory;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CreateExpenseRequest(
        String description,
        BigDecimal amount,
        ExpenseCategory category,
        LocalDate expenseDate
) {}
