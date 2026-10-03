package com.example.transfer;

public class TransferService {
    public void createTransfer(Account from, Account to, int amount) {
        from.debit(amount);
        to.credit(amount);
    }
}
