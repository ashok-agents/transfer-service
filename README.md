# transfer-service

Small money-transfer service used to demo the code review agent.

## Transfer rules

- The amount must be greater than zero.
- The source account must have enough balance.
- A successful transfer records an audit event with the two account ids and the amount.

## API

| Method | Path | Purpose |
| --- | --- | --- |
| POST | /transfers | Move money from one account to another |
| GET | /transfers/{id} | Read one transfer |
