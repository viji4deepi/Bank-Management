package com.example.bank.repository;

import com.example.bank.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface UsersRepository extends CrudRepository<UserEntity,String> {

  // UsersAccount findByid(String id);
   List<UserEntity> findAll();

   Optional<UserEntity> findById(String id);


}
