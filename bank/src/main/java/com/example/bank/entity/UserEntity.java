package com.example.bank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
@Table(name = "Bank_details")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;

    private  String account_no;
    private String name;

    @OneToMany
    private List<DataEntity> dataEntity;
    //private String account_type;
    //private long balance;
}
