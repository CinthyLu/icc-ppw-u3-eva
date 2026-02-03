package ec.ecu.ups.icc.employees.moduloCompany.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateCompanyDto {

@NotBlank(message = "El nombre de la empresa es obligatorio")
@Size(min = 3, max = 150, message = "El nombre debe tener entre 3 y 150 caracteres")
public String name;

@NotBlank(message = "El email es obligatorio")
@Email(message = "Debe ingresar un email válido")
@Size(max = 150)
public String email;

    @NotBlank(message = "El país es obligatorio")
    public String country;

    @NotBlank(message = "El estado es obligatorio")
    @Size(min = 1, max = 1, message = "El estado debe ser un solo carácter")
    public Character active;

    

}
