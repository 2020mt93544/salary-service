package com.employee.salaryservice.salaryservice.repository;

import com.employee.salaryservice.salaryservice.entity.SalaryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRepository extends MongoRepository<SalaryEntity, String> {
    SalaryEntity findByEmpId(String empId);
}
