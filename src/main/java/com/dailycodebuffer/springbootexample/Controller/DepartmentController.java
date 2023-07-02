package com.dailycodebuffer.springbootexample.Controller;

import com.dailycodebuffer.springbootexample.Entity.Department;
import com.dailycodebuffer.springbootexample.Service.DepartmentService;
import com.dailycodebuffer.springbootexample.Service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/department")
    public String helloWorld(){
        return "Other Controller";
    }

    @PostMapping("/departments")    // Whatever JSON you are getting as a request body, convert that particular JSON into a Department object
    public Department saveDepartment(@RequestBody Department department){

        return departmentService.saveDepartment(department);
    }
}
