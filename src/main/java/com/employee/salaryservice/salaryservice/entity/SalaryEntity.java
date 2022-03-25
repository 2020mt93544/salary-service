package com.employee.salaryservice.salaryservice.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_emp_salary")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "SalaryEntityBuilder")
@ToString
@EqualsAndHashCode(callSuper = false)
public class SalaryEntity {
    private String id;
    private String empId;
    private Long basic;
    private Long hra;
    private Long allowance;
    private Long pf;
}
