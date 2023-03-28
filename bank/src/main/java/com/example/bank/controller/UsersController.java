package com.example.bank.controller;


import com.example.bank.service.UserAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UsersController {

    private UserAccountService userAccountService;



//    public List<UserAccount> getUserDetails(){
//
//       return 'hello';
//    }


}
