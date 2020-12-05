package com.example.demo1.controller;


import com.example.demo1.entity.Employee;
import com.example.demo1.repository.EmployeeRepository;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    EmployeeRepository repository;

    @RequestMapping("/")
    String getAllEmployees(Model model){

        List<Employee> listEmployee = repository.findAll();
        model.addAttribute("employeeList",listEmployee);
        System.out.println("Controller Worked");
        return "Index";
    }

    @GetMapping("/getSaveIformationPage")
    String getSaveEmployeePage(Model model){
   Employee employeeObj = new Employee();
        model.addAttribute("formEmployee",employeeObj);

        List<String> deptList = new ArrayList();
        deptList.add("CSE");
        deptList.add("EEE");
        deptList.add("ETE");
        model.addAttribute("departmentList",deptList);

        List<String> genderListObj = new ArrayList();
        genderListObj.add("Male");
        genderListObj.add("Female");

        model.addAttribute("genderList",genderListObj);
        return "save-information";
    }

    @PostMapping("/employeeSave")
    String saveEmployeeInfo(@ModelAttribute Employee formEmployee){
        repository.save(formEmployee);


        return "redirect:/"; //It will call !st method
    }

}
