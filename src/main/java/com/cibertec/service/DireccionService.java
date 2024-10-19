package com.cibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.model.Direccion;
import com.cibertec.repository.DireccionRepository;

@Service
public class DireccionService {
	
	@Autowired
	private DireccionRepository direccionrepository;
	
	
	public Direccion addDireccion(Direccion direccion){
		Direccion saveDirecciontoDB=this.direccionrepository.save(direccion);
		return saveDirecciontoDB;
	}
}
