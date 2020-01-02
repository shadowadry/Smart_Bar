package com.bar.rest.entity;

import java.io.Serializable;

//import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity
//@Table(name = "Trago")
//@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Trago implements Serializable{

	private static final long serialVersionUID = 1L;

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_trago;

    @NotBlank
    private Long Id_intensidad;

    @NotBlank
    private String Nombre;
    
    @NotBlank
    private String Descripcion;
    
    @NotBlank
    private Boolean Disponible;
    
    @NotBlank
    private int Grado_alcohol;

	public Long getId_trago() {
		return Id_trago;
	}

	public void setId_trago(Long id_trago) {
		Id_trago = id_trago;
	}

	public Long getId_tipo_intensidad() {
		return Id_intensidad;
	}

	public void setId_tipo_intensidad(Long id_intensidad) {
		Id_intensidad = id_intensidad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Boolean getDisponible() {
		return Disponible;
	}

	public void setDisponible(Boolean disponible) {
		Disponible = disponible;
	}

	public int getGrado_alcohol() {
		return Grado_alcohol;
	}

	public void setGrado_alcohol(int grado_alcohol) {
		Grado_alcohol = grado_alcohol;
	}
    
    
    
}
