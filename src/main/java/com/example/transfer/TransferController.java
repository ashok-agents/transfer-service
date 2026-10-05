package com.example.transfer;

public class TransferController {
    public String create(String caller, String fromId, String toId, int amount) {
        String transferId = fromId + "-" + toId;
        return transferId + ":" + amount;
    }
}
