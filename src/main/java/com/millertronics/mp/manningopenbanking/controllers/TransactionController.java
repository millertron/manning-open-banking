package com.millertronics.mp.manningopenbanking.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.millertronics.mp.manningopenbanking.models.Transaction;
import com.millertronics.mp.manningopenbanking.services.TransactionService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("/{accountNumber}")
    public List<Transaction> getTransactionsByAccountNumber(@PathVariable final String accountNumber) {
        return transactionService.findAllByAccountNumber(accountNumber);
    }

}
