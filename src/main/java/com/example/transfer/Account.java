package com.example.transfer;

public class Account {
    private final String id;
    private int balance;

    public Account(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void debit(int amount) {
        balance -= amount;
    }

    public void credit(int amount) {
        balance += amount;
    }
}
