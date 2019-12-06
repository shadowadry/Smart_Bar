
package com.bar.rest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Usuario")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Favorito implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    private Long Id_trago;

	@Id
    private Long Id_usuario;  
	
	@NotBlank
	private String descripcion;

	public Long getId_trago() {
		return Id_trago;
	}

	public void setId_trago(Long id_trago) {
		Id_trago = id_trago;
	}

	public Long getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		Id_usuario = id_usuario;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
