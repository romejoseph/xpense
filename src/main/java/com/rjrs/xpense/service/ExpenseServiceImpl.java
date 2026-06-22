package com.rjrs.xpense.service;

import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.entity.ExpenseCategory;
import com.rjrs.xpense.repository.ExpenseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Service
class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseRepository repo;

    public ExpenseServiceImpl(ExpenseRepository repo) {
        this.repo = repo;
    }

    @Override
    public Expense createExpense(String description, BigDecimal amount, ExpenseCategory category, LocalDate expenseDate) {
        return this.repo.save(new Expense(description, amount, category, expenseDate));
    }

    @Override
    public Page<Expense> getAllExpenses(Pageable pageable) {
        return this.repo.findAll(pageable);
    }

    @Override
    public Expense getExpenseByUUID(UUID uuid) {
        return this.repo.findById(uuid).orElseThrow();
    }

    @Override
    public void deleteExpense(UUID uuid) {
        this.repo.deleteById(uuid);
    }
}
