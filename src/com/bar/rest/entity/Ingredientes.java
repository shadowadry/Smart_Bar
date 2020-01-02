
package com.bar.rest.entity;

import java.io.Serializable;

//import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity
//@Table(name = "Ingrediente")
//@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Ingredientes implements Serializable{

	private static final long serialVersionUID = 1L;

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_ingrediente;

    @NotBlank
    private Long Id_elemento;

    @NotBlank
    private Long Medida;

	public Long getId_ingrediente() {
		return Id_ingrediente;
	}

	public void setId_ingrediente(Long id_ingrediente) {
		Id_ingrediente = id_ingrediente;
	}

	public Long getId_elemento() {
		return Id_elemento;
	}

	public void setId_elemento(Long id_elemento) {
		Id_elemento = id_elemento;
	}

	public Long getMedida() {
		return Medida;
	}

	public void setMedida(Long medida) {
		Medida = medida;
	}
    
    
}
