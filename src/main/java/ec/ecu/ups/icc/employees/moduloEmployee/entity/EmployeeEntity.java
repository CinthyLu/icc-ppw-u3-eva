package ec.ecu.ups.icc.employees.moduloEmployee.entity;
import ec.ecu.ups.icc.employees.moduloDepartment.entity.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


public class EmployeeEntity {

    @Entity
    @Table (name = "employees")
    public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Character active;
    private Double salary;
    private Department department;

 }

}



