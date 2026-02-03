package ec.ecu.ups.icc.employees.moduloDepartment.entity;
import ec.ecu.ups.icc.employees.moduloEmployee.entity.Employee;
import ec.ecu.ups.icc.employees.moduloCompany.entity.Company;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

public class Department {

    private Long id;
    private String name;
    private Double budget;
    private Character active;
    private Company company;
    private List<Employee> employees;




    public Department(Long id, String name, double budget, char active   ) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.active = active;
        this.company = company;
        this.employees = employees;

    }
}