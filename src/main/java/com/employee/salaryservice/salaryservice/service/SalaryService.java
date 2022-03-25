package com.employee.salaryservice.salaryservice.service;

import com.employee.salaryservice.salaryservice.entity.SalaryEntity;

public interface SalaryService {
    SalaryEntity getEmpSalary(String empId);
}
