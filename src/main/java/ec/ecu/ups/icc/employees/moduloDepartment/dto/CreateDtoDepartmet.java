package ec.ecu.ups.icc.employees.moduloDepartment.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class CreateDtoDepartmet {

@NotBlank(message = "El nombre del departamento es obligatorio")
@Size(min = 3, max = 150, message = "El nombre debe tener entre 3 y 150 caracteres")
public String name;

@NotBlank(message = "El presupuesto del departamento es obligatorio")
public Double budget;

@NotBlank(message = "El estado es obligatorio")
public Character active;

@NotBlank(message = "La compañía es obligatoria")
public Long companyId;

}

