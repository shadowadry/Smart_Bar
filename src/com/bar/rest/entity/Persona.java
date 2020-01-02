
package com.bar.rest.entity;

import java.io.Serializable;
import java.util.Date;

//import javax.persistence.*;
import javax.validation.constraints.NotBlank;

//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//@Entity
//@Table(name = "Persona")
//@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)

public class Persona implements Serializable{

	private static final long serialVersionUID = 1L;

//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_persona;

//    @NotBlank
    private String Nombre;
    
//    @NotBlank
    private String Apellido;
    
//    @NotBlank
    private String Email;
    
//    @NotBlank
    private Date fechaNacimiento;
    
//    @NotBlank
    private String Telefono;
    
//    @NotBlank
    private String Profesion;

	public Long getId_persona() {
		return Id_persona;
	}

	public void setId_persona(Long id_persona) {
		Id_persona = id_persona;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getProfesion() {
		return Profesion;
	}

	public void setProfesion(String profesion) {
		Profesion = profesion;
	}
    
}
