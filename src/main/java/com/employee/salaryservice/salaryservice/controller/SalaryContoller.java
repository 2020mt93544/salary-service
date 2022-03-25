package com.employee.salaryservice.salaryservice.controller;

import com.employee.salaryservice.salaryservice.entity.SalaryEntity;
import com.employee.salaryservice.salaryservice.service.SalaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salary")
public class SalaryContoller {

    private final SalaryService salaryService;

    public SalaryContoller(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @GetMapping("/getEmpSalary")
    public SalaryEntity getEmpSalaryDetails(@RequestParam String empId) {
        return salaryService.getEmpSalary(empId);
    }

}
