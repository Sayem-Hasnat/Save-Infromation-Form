package com.example.demo1.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Data
@Entity(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id;
    @Column
    String name;
    @Column
    int age;
    @Column
    String dept;
    @Column
    String gender;


}
