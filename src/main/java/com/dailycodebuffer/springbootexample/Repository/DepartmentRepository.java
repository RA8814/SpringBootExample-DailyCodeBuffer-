package com.dailycodebuffer.springbootexample.Repository;

import com.dailycodebuffer.springbootexample.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
