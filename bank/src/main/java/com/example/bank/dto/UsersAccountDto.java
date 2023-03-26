package com.example.bank.dto;

import lombok.Data;

// THis is used for all getter, setters, constructors and to string
@Data
public class UsersAccountDto {

        private  String userAccNo;
        private String name;

        private String account_type;
        private long balance;
}
