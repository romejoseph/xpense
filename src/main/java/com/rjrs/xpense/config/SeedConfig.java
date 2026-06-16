package com.rjrs.xpense.config;

import com.rjrs.xpense.entity.Expense;
import com.rjrs.xpense.entity.ExpenseCategory;
import com.rjrs.xpense.repository.ExpenseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
class SeedConfig {

    @Bean
    CommandLineRunner seed(ExpenseRepository repository) {
        return args -> {
            repository.save(new Expense("Jollibee", BigDecimal.valueOf(300), ExpenseCategory.FOOD, LocalDate.now()));
        };
    }
}
