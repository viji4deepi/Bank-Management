package com.example.bank.repository;

import com.example.bank.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DataEntityRepository extends JpaRepository<DataEntity, String> {

    Optional<DataEntity> findByNumber(String number);
}
