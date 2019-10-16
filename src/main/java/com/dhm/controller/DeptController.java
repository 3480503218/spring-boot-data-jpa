package com.dhm.controller;

import com.dhm.Repository.DepartmentRepository;
import com.dhm.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DeptController {
    @Autowired
    DepartmentRepository departmentRepository;
    @RequestMapping("/find/{id}")
    public Dept getDept(@PathVariable("id") Integer id){
        Dept dept = departmentRepository.findOne(id);
        return dept;
    }

    @RequestMapping("/find")
    public Dept getDept(Dept dept){
        Dept save = departmentRepository.save(dept);
        return save;
    }
}
