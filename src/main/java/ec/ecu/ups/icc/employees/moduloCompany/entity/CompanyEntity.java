package ec.ecu.ups.icc.employees.moduloCompany.entity;
import ec.ecu.ups.icc.employees.moduloDepartment.entity.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.util.List;


public class CompanyEntity {

    @Entity
    @Table (name = "companies")
    public class Company {
    private Long id;
    private String name;
    private String country;
    private Character active;
    private List<Department> departments;

}
}
