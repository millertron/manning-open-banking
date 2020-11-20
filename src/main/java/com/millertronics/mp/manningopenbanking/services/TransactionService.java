package com.millertronics.mp.manningopenbanking.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.millertronics.mp.manningopenbanking.models.Transaction;

@Service
public class TransactionService {

    private final List<Transaction> transactions = List.of(
        new Transaction("account01"),
        new Transaction("account01"),
        new Transaction("account02"),
        new Transaction("account03"),
        new Transaction("account03"),
        new Transaction("account03")
    );

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return transactions.stream()
            .filter(transaction -> accountNumber.equals(transaction.accountNumber))
            .collect(Collectors.toList());
    }
}
