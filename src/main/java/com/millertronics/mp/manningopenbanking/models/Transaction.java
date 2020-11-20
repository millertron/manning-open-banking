package com.millertronics.mp.manningopenbanking.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Transaction {

    public String type;
    public String accountNumber;
    public String currency;
    public String amount;
    public String merchantName;
    public String merchantLogo;

    public Transaction(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
