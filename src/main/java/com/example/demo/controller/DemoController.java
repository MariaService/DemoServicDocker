package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UsuarioDTO;

@RestController
public class DemoController {

	@GetMapping("/usuarios")
	public List<UsuarioDTO> obtenerUsuarios() {
		return List.of(new UsuarioDTO(1L, "Carlos Morales", "carlos@test.com", "Puebla", 29, "Backend Developer"),
				new UsuarioDTO(2L, "Ana López", "ana@test.com", "CDMX", 27, "QA Engineer"),
				new UsuarioDTO(3L, "Luis Hernández", "luis@test.com", "Monterrey", 31, "DevOps"),
				new UsuarioDTO(4L, "María García", "maria@test.com", "Guadalajara", 26, "Frontend Developer"),
				new UsuarioDTO(5L, "Jorge Pérez", "jorge@test.com", "Puebla", 33, "Tech Lead"));

	}
}