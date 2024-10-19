package com.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ADD_INFO")
public class Direccion {
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
     private Long id;
     private String address;
     
     @OneToOne
     private Empleado empleado;
     
     @Override
     public String toString() {
    	 return "Direccion [id="+id+", direccion="+address+"]";
     }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
     
}

