package ec.ecu.ups.icc.employees.moduloCompany.entity;

import ec.ecu.ups.icc.employees.moduloDepartment.entity.Department;

import java.util.List;

public class Company {

        private Long id;
    private String name;
    private String country;
    private Character active;
    private List<Department> departments;

    public Company(Long id, String name, String country, char active ) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.active = active;
        this.departments = departments;
    }

}
