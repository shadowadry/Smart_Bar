
package com.bar.rest.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Tipo_intensidad")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Tipo_intensidad implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_intensidad;

    @NotBlank
    private String Descripcion;
    
    @NotBlank
    private Long Id_ingrediente;

	public Long getId_intensidad() {
		return Id_intensidad;
	}

	public void setId_intensidad(Long id_intensidad) {
		Id_intensidad = id_intensidad;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Long getId_ingrediente() {
		return Id_ingrediente;
	}

	public void setId_ingrediente(Long id_ingrediente) {
		Id_ingrediente = id_ingrediente;
	}
    
}
