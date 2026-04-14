package com.example.demo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UsuarioDTO {

	private Long id;
	private String nombre;
	private String correo;
	private String ciudad;
	private Integer edad;
	private String puesto;

	public UsuarioDTO(Long id, String nombre, String correo, String ciudad, Integer edad, String puesto) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.ciudad = ciudad;
		this.edad = edad;
		this.puesto = puesto;
	}
}
