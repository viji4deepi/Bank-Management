package com.example.bank.service;

import com.example.bank.dto.UsersAccount;
import com.example.bank.entity.UserEntity;
import com.example.bank.mapper.UserAccountMapper;
import com.example.bank.repository.UsersRepository;
import lombok.Setter;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountService implements UserAccountMapper {

    private UserAccountMapper userAccountMapper;
private UsersRepository usersRepository;

//    public User readUser(String id){
//       UserEntity userEntity = usersRepository.findById(id).get();
//       return userAccountMapper.convertToDto(userEntity);
//    }
    @Override
    public UsersAccount mapToUsersDto(UserEntity userEntity) {

        return userAccountMapper.mapToUsersDto(userEntity);
    }

    @Override
    public List<UsersAccount> mapToUsersDto(List<UserEntity> userEntityList) {
        return userAccountMapper.mapToUsersDto(userEntityList);
    }

//    public List<UserEntity> findAll(){
//        return usersRepository.findAll();
//    }

}
