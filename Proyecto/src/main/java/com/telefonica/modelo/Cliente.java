package com.telefonica.modelo;

import java.time.LocalDate;

public class Cliente {
	private int id;
	private String nombre;
	private String primerApellido;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;
	private int idhotel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public LocalDate getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public int getIdhotel() {
		return idhotel;
	}
	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}
	
	

}
