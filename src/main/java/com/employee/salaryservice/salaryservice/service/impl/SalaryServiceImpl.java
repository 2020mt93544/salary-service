package com.employee.salaryservice.salaryservice.service.impl;

import com.employee.salaryservice.salaryservice.entity.SalaryEntity;
import com.employee.salaryservice.salaryservice.repository.SalaryRepository;
import com.employee.salaryservice.salaryservice.service.SalaryService;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {

    private final SalaryRepository salaryRepository;

    public SalaryServiceImpl(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    @Override
    public SalaryEntity getEmpSalary(String empId) {
        SalaryEntity salaryEntity = salaryRepository.findByEmpId(empId);
        return salaryEntity;
    }
}
