package com.bar.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

	private List<Usuario> listaUsuarios;
	
	public List<Usuario> getListaUsuarios() {
	
		if(listaUsuarios == null) {
			listaUsuarios = new ArrayList<Usuario>();
		}
		return listaUsuarios;
	}
	
}
