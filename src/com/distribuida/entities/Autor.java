package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component

public class Autor {

	//atributos
	private int idAutor;
	private String nombre;
	private String apellido;
	private String pais;
	private Date fechaNacimiento;
	
	public Autor(int idAutor, String nombre, String apellido, String pais, Date fechaNacimiento) {
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Autor [idAutor=" + idAutor + ", nombre=" + nombre + ", apellido=" + apellido + ", pais=" + pais
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	
	
}
