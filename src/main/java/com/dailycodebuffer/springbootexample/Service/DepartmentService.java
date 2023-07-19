package com.dailycodebuffer.springbootexample.Service;

import com.dailycodebuffer.springbootexample.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Optional<Department> fetchDepartmentById(Long departmentId);
}
