# transfer-service

A small Spring Boot service that moves money between two accounts.
It exists as a demo target for an automated pull request reviewer, so the code is kept small and readable.

## What it does

- Creates a transfer from one account to another.
- Rejects a transfer when the amount is zero or negative, the two accounts are the same, or the source balance is too low.
- Returns a transfer by id so a client can check its status.

## API

| Method | Path | Purpose |
|---|---|---|
| `POST` | `/api/v1/transfers` | Create a transfer |
| `GET` | `/api/v1/transfers/{id}` | Get one transfer |

Example request:

```json
{
  "fromAccountId": "acc-001",
  "toAccountId": "acc-002",
  "amount": 25.00,
  "currency": "EUR"
}
```

Transfer status is one of `PENDING`, `COMPLETED`, or `REJECTED`.

## Rules

- Amount must be greater than zero.
- Source and target accounts must be different.
- Both accounts must use the same currency.
- One transfer updates both balances in a single database transaction.

## Planned layout

The Java code is not in the repository yet. This is where it will go:

- `src/main/java/.../TransferController.java` handles HTTP requests only.
- `src/main/java/.../TransferService.java` holds the business rules.
- `src/main/java/.../TransferRepository.java` is the database access.
- `src/test/java/...` holds unit tests for the service and an integration test for the API.

## Run locally

Requires Java 21 and Maven.

```bash
mvn spring-boot:run
```

The service starts on `http://localhost:8080`.

## Reviews

Every pull request is reviewed by the code review agent.
A person approves the draft before any comment is posted.
