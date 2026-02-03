package ec.ecu.ups.icc.employees.moduloDepartment.entity;
import ec.ecu.ups.icc.employees.moduloEmployee.entity.Employee;
import ec.ecu.ups.icc.employees.moduloCompany.entity.Company;
import java.util.List;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;

public class DepartmentEntity {

    @Entity
    @Table( name = "departments")
    public class Department {
        private Long id;
        private String name;
        private Double budget;
        private Character active;
        private Company company;
        private List<Employee> employees;
}
}