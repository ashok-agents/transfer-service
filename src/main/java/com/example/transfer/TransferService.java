package com.example.transfer;

import java.util.ArrayList;
import java.util.List;

public class TransferService {
    private final List<String> auditEvents = new ArrayList<>();

    public void createTransfer(Account from, Account to, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }
        from.debit(amount);
        to.credit(amount);
        auditEvents.add(from.getId() + " -> " + to.getId() + " amount " + amount);
    }

    public List<String> getAuditEvents() {
        return List.copyOf(auditEvents);
    }
}
