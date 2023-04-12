package com.example.bank.dto;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

// THis is used for all getter, setters, constructors and to string
@Data
public class UsersAccount {


        private  String userAccNo;

        private String name;

        @OneToMany
        private List<BankAccount> accounts;


}
