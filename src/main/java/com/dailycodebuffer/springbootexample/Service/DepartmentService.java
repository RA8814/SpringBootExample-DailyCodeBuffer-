package com.dailycodebuffer.springbootexample.Service;

import com.dailycodebuffer.springbootexample.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Optional<Department> fetchDepartmentById(Long departmentId);

    String deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    List<Department> fetchDepartmentByName(String departmentName);
}
