package ec.ecu.ups.icc.employees.moduloEmployee.entity;
import ec.ecu.ups.icc.employees.moduloCompany.entity.Company;

import ec.ecu.ups.icc.employees.moduloDepartment.entity.Department;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Character active;
    private Double salary;
    private Department department;


public Employee(Long id, String firstName, String lastName, String email, char active, double salary, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.active = active;
        this.salary = salary;
        this.department = department;
    }


}
