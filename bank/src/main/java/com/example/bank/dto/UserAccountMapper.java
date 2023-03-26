package com.example.bank.dto;

import com.example.bank.entity.UserAccount;
import org.mapstruct.Mapping;

import java.util.List;

public interface UserAccountMapper {

   @Mapping(target = "userAccNo", source ="userAccount.account_no")
    UsersAccountDto mapToUsersDto(UserAccount userAccount);

    List<UsersAccountDto> mapToUsersDto (List<UserAccount> userAccount);
}
