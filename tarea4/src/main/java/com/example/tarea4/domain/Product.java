package com.example.tarea4.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class Product {
	
	@Size(min = 12, max = 12, message = "El codigo debe ser de 12 digitos")
	String codeProdUni;
	
	@Size(min = 1, max = 100, message = "No puede dejar en blanco el nombre del producto")
	String nombreProducto;
	
	@Size(min = 1, max = 100, message = "No puede dejar en blanco el nombre de la marca")
	String marca;
	
	@Size(min = 1, max = 500, message = "No puede dejar en blanco la descripcion del producto")
	String descripcion;
	
	@NotNull(message = "Debe ingresar una cantidad de existencias (puede ser 0)")
	Integer existencias;
	
	@Pattern(regexp = "^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.](0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$", message = "La fecha debe ser ingresada de esta manera: dd/mm/yyyy")
	String fechaIngreso;

	public String getCodeProdUni() {
		return codeProdUni;
	}

	public void setCodeProdUni(String codeProdUni) {
		this.codeProdUni = codeProdUni;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getExistencias() {
		return existencias;
	}

	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}
