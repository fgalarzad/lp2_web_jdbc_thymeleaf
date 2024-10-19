package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.model.Empleado;
import com.cibertec.service.EmpleadoService;

@RestController
@RequestMapping("Empleado")
public class ProyectoController {
	@Autowired
	private EmpleadoService empleadoservice;
	
	@PostMapping("add")
	public ResponseEntity<Empleado> saveEmpleado(@RequestBody Empleado empleado) throws Exception{
		Empleado saveEmpleadotoDB= this.empleadoservice.addEmpleado(empleado);
		return new ResponseEntity<Empleado>(saveEmpleadotoDB,HttpStatus.CREATED);
	}
	

}
