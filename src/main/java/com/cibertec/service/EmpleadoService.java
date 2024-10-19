package com.cibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cibertec.model.Direccion;
import com.cibertec.model.Empleado;
import com.cibertec.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
	@Autowired
	private EmpleadoRepository empleadorepository;
	@Autowired
	private DireccionService direccionservice;
	
	@Transactional
	public Empleado addEmpleado(Empleado empleado)throws Exception{
		Empleado saveEmpleadotoDB=this.empleadorepository.save(empleado);
		Direccion direccion= new Direccion();
		direccion.setId(123L);
		direccion.setAddress("Varanassi");
		direccion.setEmpleado(empleado);
		
		this.direccionservice.addDireccion(direccion);
		return saveEmpleadotoDB;
	}
}
