package com.example.NestDigitalApp_backendd.controller;

import com.example.NestDigitalApp_backendd.dao.EmployeeDao;
import com.example.NestDigitalApp_backendd.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

@Autowired
private EmployeeDao edao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp",produces = "applicatiom/json",consumes = "application/json")
    public String Addemp(@RequestBody Employee e){
    System.out.println(e.getEcode().toString());
    System.out.println(e.getEname().toString());
    System.out.println(e.getEdesignation().toString());

    edao.save(e);
    return "Employee Added Successfully";

}

    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmp")
    public List<Employee> ViewEmp(){
        return (List<Employee>) edao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchEmp",consumes = "application/json",produces = "application/json")
    public List<Employee> SearchEmp(@RequestBody Employee e){
        String empcode=String.valueOf(e.getEcode());
        System.out.println(empcode);
        return (List<Employee>) edao.SearchEmp(e.getEcode());
    }


}
