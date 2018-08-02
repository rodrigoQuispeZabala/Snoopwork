package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import interfaces.IEquipo;

public class Jugador {
	
	private int numero;
	private String nombre;
	
	@Autowired
	@Qualifier("barcelonaQualifier")
	private IEquipo equipo;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public IEquipo getEquipo() {
		return equipo;
	}
	@Required
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
	
	
}
