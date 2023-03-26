package com.example.bank.repository;

import com.example.bank.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsersRepository extends JpaRepository<UserAccount,String> {

    List<UserAccount> findAll();
    //UserAccount findByAccount(String account_no);

}
