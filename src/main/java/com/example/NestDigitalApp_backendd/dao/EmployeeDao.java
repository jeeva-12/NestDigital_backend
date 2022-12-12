package com.example.NestDigitalApp_backendd.dao;

import com.example.NestDigitalApp_backendd.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `ecode`, `edesignation`, `ename`, `epassword`, `eusername` FROM `employee` WHERE `eusername` = :eusername AND `epassword` = :epassword",nativeQuery = true)
    List<Employee> UserLogin(@Param("eusername")String eusername,@Param("epassword") String epassword);

    @Query(value = "SELECT `id`, `ecode`, `edesignation`, `ename`, `epassword`, `eusername` FROM `employee` WHERE `id` = :id",nativeQuery = true)
    List<Employee> FindUserById (@Param("id") Integer id);

    @Query(value = "SELECT `id`, `ecode`, `edesignation`, `ename`, `epassword`, `eusername` FROM `employee` WHERE `ecode` = :ecode",nativeQuery = true)
    List<Employee> SearchEmp(@Param("ecode")String ecode);
}
