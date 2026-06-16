package com.rjrs.xpense.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @NotBlank
    String description;

    @Positive
    BigDecimal amount;

    @NotNull
    @Enumerated(EnumType.STRING)
    ExpenseCategory category;

    @NotNull
    LocalDate expenseDate;

    @CreationTimestamp
    LocalDateTime createdAt;

    public Expense(String description, BigDecimal amount, ExpenseCategory category, LocalDate expenseDate) {
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.expenseDate = expenseDate;
    }
}
