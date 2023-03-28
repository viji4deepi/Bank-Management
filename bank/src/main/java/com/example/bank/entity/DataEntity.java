package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Entity
@Table(name = "bank_core_details")
@Getter
@Setter
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private String id;

    private String number;
    @Enumerated(EnumType.STRING)
    private AccountType account_type;

    @Enumerated(EnumType.STRING)
    private AccountStatus balance;

    private BigDecimal currentBalance;

    private  BigDecimal actualBalance;


}
