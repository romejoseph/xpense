# xpense

A simple Spring Boot REST API for tracking expenses. Built with Spring Boot, Spring Data JPA, H2 (in-memory) and Java 21.

## Features

- Create, list (paginated), retrieve and delete expenses
- Validation on expense fields
- In-memory H2 database (default) for easy local development
- Global exception handling with structured error responses

## Tech

- Java 21
- Spring Boot 3.5.x
- Spring Data JPA, Spring Web, Validation
- H2 (runtime)
- Maven

## Requirements

- Java 21
- Maven 3.x

## Build & Run

From project root:

- Build: `mvn clean package`
- Run with Maven: `mvn spring-boot:run`
- Or run the packaged jar: `java -jar target/xpense-0.0.1-SNAPSHOT.jar`

The app runs on port 8080 by default.

## Configuration

Defaults are in `src/main/resources/application.properties` and use an in-memory H2 DB:

- JDBC URL: `jdbc:h2:mem:testdb`
- H2 console: `http://localhost:8080/h2-console` (user: `provide`, password: `provide`)

## API

Base path: `/expenses`

1) Create expense
- POST /expenses
- Body (JSON):
  {
    "description": "Lunch",
    "amount": 12.50,
    "category": "FOOD",
    "expenseDate": "2026-06-23"
  }
- Response: 201 Created — created Expense object (includes UUID `id`)

2) List expenses (paged)
- GET /expenses?page=0&size=10
- Returns a Spring Data Page<Expense> (JSON) — supports `page`, `size`, `sort` query params

3) Get expense by id
- GET /expenses/{uuid}
- Response: 200 OK or 404 with JSON error:
  {
    "timestamp": "...",
    "message": "Expense not found.",
    "status": 404
  }

4) Delete expense
- DELETE /expenses/{uuid}
- Response: 200 OK (void)

## DTO / Model

- CreateExpenseRequest: `description` (String), `amount` (BigDecimal), `category` (enum: FOOD, TRANSPORT, UTILITIES, ENTERTAINMENT, OTHER), `expenseDate` (LocalDate)
- Expense entity includes `id` (UUID), `description`, `amount`, `category`, `expenseDate`, `createdAt`.

## Tests

Run unit tests with:

`mvn test`

## Contributing

PRs welcome. Please follow standard Java formatting and include tests for new behaviors.

## License

This project is licensed under the MIT License — see the `LICENSE` file.

---

Author: Rome Joseph Santos
