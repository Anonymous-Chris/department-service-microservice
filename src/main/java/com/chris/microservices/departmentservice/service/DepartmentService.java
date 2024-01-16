package com.chris.microservices.departmentservice.service;

import com.chris.microservices.departmentservice.model.Department;

public interface DepartmentService {
    Department saveDepartment(Department department);

    Department getDepartmentById(Long departmentId);
}