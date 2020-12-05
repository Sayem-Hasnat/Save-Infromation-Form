package com.example.demo1.init;

import com.example.demo1.entity.Employee;
import com.example.demo1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeData implements CommandLineRunner {
    @Autowired
    EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Data Initialized");

//        repository.deleteAll();
//
//        Employee employee1 = new Employee();
//        employee1.setName("Komola");
//        employee1.setAge(48);
//        employee1.setDept("President");
//        repository.save(employee1);
//
//        Employee employee2 = new Employee();
//        employee2.setName("Haris");
//        employee2.setAge(23);
//        employee2.setDept("Vice-President");
//        repository.save(employee2);
//
//        Employee employee3 = new Employee();
//        employee3.setName("Arefin");
//        employee3.setAge(26);
//        employee3.setDept("Office");
//        repository.save(employee3);

    }
}
