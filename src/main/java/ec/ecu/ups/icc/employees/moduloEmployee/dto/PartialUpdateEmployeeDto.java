package ec.ecu.ups.icc.employees.moduloEmployee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;


public class PartialUpdateEmployeeDto {



   @Size(min = 3, max = 150)
     public String firstName;

        @Size(min = 3, max = 150)
     public String lastName;



     @Email
     @Size(max = 150)
     public String email;

     
}
