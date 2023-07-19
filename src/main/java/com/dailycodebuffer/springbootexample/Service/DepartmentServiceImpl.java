package com.dailycodebuffer.springbootexample.Service;

import com.dailycodebuffer.springbootexample.Entity.Department;
import com.dailycodebuffer.springbootexample.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId);
    }

    @Override
    public String deleteDepartmentById(Long departmentId) {
        Optional<Department> potentialDepartment = departmentRepository.findById(departmentId);
        if (potentialDepartment.isEmpty()){
            return "No such department";
        }
        else {
            Department department = potentialDepartment.orElse(null);
            departmentRepository.delete(department);
            return "Department Deleted";
        }
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department potentialDepartment = departmentRepository.findById(departmentId).get();
        String departmentName = department.getDepartmentName();
        String departmentAddress = department.getDepartmentAddress();
        String departmentCode = department.getDepartmentCode();

        if (Objects.nonNull(departmentName) && !"".equalsIgnoreCase(departmentName)){
            potentialDepartment.setDepartmentName(departmentName);
        }

        if (Objects.nonNull(departmentAddress) && !"".equalsIgnoreCase(departmentAddress)){
            potentialDepartment.setDepartmentAddress(departmentAddress);
        }

        if (Objects.nonNull(departmentCode) && !"".equalsIgnoreCase(departmentCode)){
            potentialDepartment.setDepartmentCode(departmentCode);
        }
        return departmentRepository.save(potentialDepartment);
    }

    @Override
    public List<Department> fetchDepartmentByName(String departmentName) {
        return departmentRepository.findAllByDepartmentName(departmentName);
    }

}
