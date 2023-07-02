package com.dailycodebuffer.springbootexample.Service;

import com.dailycodebuffer.springbootexample.Entity.Department;
import com.dailycodebuffer.springbootexample.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
