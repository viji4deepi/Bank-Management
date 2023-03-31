package com.example.bank.controller;


import com.example.bank.entity.UserEntity;
import com.example.bank.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

  //  private UserAccountService userAccountService;

    @Autowired
    private  UsersRepository usersRepository;
//  public UsersController(UsersRepository usersRepository) {
//    this.usersRepository = usersRepository;
//  }

    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        return (List<UserEntity>) usersRepository.findAll();
    }



}
