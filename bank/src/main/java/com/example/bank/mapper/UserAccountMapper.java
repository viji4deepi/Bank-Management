package com.example.bank.mapper;

import com.example.bank.dto.UsersAccount;
import com.example.bank.entity.UserEntity;
import org.mapstruct.Mapping;

import java.util.List;

public interface UserAccountMapper {

   @Mapping(target = "userAccNo", source ="userAccount.account_no")
   UsersAccount mapToUsersDto(UserEntity userEntity);

    List<UsersAccount> mapToUsersDto (List<UserEntity> userEntityList);
}
