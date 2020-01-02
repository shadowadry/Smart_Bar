
package com.bar.rest.entity;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity
//@Table(name = "Usuario")
//@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_usuario;

//    @NotBlank
    private Long Id_persona;
    
//    @NotBlank
    private String Usuario;
    
//    @NotBlank
    private String Password;
    
//    @NotBlank
    private Date fechaCreacion;

	public Long getId_usuario() {
		return Id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		Id_usuario = id_usuario;
	}

	public Long getId_persona() {
		return Id_persona;
	}

	public void setId_persona(Long id_persona) {
		Id_persona = id_persona;
	}

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}    
    
}
