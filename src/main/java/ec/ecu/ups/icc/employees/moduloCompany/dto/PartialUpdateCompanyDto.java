package ec.ecu.ups.icc.employees.moduloCompany.dto;

import jakarta.validation.constraints.Size;

public class PartialUpdateCompanyDto {
    
    
  

   @Size(min = 3, max = 150)
    private String name;

    @Size(min = 3, max = 150)
    private String country;

    @Size(min = 1, max = 1)
    private Character active;
}
