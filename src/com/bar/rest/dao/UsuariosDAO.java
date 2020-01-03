package com.bar.rest.dao;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.bar.rest.model.Trago;
import com.bar.rest.model.Tragos;
import com.bar.rest.model.Usuario;
import com.bar.rest.model.Usuarios;

@Repository
public class UsuariosDAO {
	private static Usuarios listaUsuarios = new Usuarios();
	
//  @Value("${entrypoint.db.definition}")
//  private String entryPointDBdefinition;
	
    static
    {
    	listaUsuarios.getListaUsuarios().add(new Usuario(0, "Gustavo Adrian", "Gonzalez", "shadowadry@gmail.com", "universitario con gustos de bebidas dulces y blancas"));
    }
	
    public Usuarios getAllusuarios() {
    	return listaUsuarios;
    }
    
    public void addUsuario(Usuario usuario) {
    	listaUsuarios.getListaUsuarios().add(usuario);
    }
    
    
    
}
