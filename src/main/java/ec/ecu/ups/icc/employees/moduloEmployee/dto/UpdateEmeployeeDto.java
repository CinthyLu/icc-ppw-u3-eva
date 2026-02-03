package ec.ecu.ups.icc.employees.moduloEmployee.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UpdateEmeployeeDto {

     @NotBlank
  @Size(min = 3, max = 150)
     public String firstName;

          @NotBlank
  @Size(min = 3, max = 150)
     public String lastName;

     @NotBlank
     @Email
     @Size(max = 150)
     public String email;

     @NotBlank
     @Size(min = 8)
     public String password;

}
