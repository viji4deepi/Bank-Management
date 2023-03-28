package com.example.bank.mapper;

import com.example.bank.dto.BankAccount;
import com.example.bank.entity.DataEntity;

import java.util.List;

public interface BankAccountMapper {

    BankAccount mapToBankAccountDto(DataEntity dataEntity);

    List<BankAccount> mapToBankAccountDto( List<DataEntity> dataEntityList);
}
