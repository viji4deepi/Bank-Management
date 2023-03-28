package com.example.bank.dto;

import com.example.bank.entity.AccountStatus;
import com.example.bank.entity.AccountType;

import java.math.BigDecimal;

public class BankAccount {
    private String id;
    private AccountType accountType;

    private AccountStatus accountStatus;

    private BigDecimal currentBalance;

    private  BigDecimal actualBalance;
}
