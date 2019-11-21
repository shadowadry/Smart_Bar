package com.bar.rest.model;

public class Trago {

	private Integer id;
	private String nombre;
	private Double cantidadAlcohol;
	private String ingredientes;
	
	public Trago() {}

	public Trago(Integer id, String nombre, Double cantindadAlcohol, String ingredientes ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadAlcohol = cantindadAlcohol;
		this.ingredientes = ingredientes;
	}
	
	@Override
	public String toString() {
		return "Trago [id=" + id + ", nombre=" + nombre + ", cantidadAlcohol=" + cantidadAlcohol + ", ingredientes="
				+ ingredientes + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCantidadAlcohol() {
		return cantidadAlcohol;
	}

	public void setCantidadAlcohol(Double cantidadAlcohol) {
		this.cantidadAlcohol = cantidadAlcohol;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	
}
