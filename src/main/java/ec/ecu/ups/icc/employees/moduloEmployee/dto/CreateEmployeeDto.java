package ec.ecu.ups.icc.employees.moduloEmployee.dto;

import ec.ecu.ups.icc.employees.moduloDepartment.entity.Department;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class CreateEmployeeDto {



@NotBlank(message = "El nombre es obligatorio")
@Size(min = 3, max = 150, message = "El nombre debe tener entre 3 y 150 caracteres")
public String firstName;


@NotBlank(message = "El apellido es obligatorio")
public String lastName;

@NotBlank(message = "El email es obligatorio")
@Email(message = "Debe ingresar un email válido")
@Size(max = 150)
public String email;

@NotBlank(message = "El estado es obligatorio")
public Character active;

@NotBlank(message = "El salario es obligatorio")
private Double salary;

@NotBlank(message = "El departamento es obligatorio")
private Department department;




}