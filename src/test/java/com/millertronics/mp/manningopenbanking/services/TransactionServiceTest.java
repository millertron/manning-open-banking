package com.millertronics.mp.manningopenbanking.services;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.empty;

public class TransactionServiceTest {

    private TransactionService target = new TransactionService();

    @Test
    public void findAllByAccountNumber_shouldReturnPopulatedList() {
        String accountNumber = "account01";
        assertThat(target.findAllByAccountNumber(accountNumber), not(empty()));
    }
}
