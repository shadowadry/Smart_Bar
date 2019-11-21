package com.bar.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Tragos {

	private List<Trago> listaTragos;
	
	public List<Trago> getListaTragos() {
	
		if(listaTragos == null) {
			listaTragos = new ArrayList<Trago>();
		}
		return listaTragos;
	}
	
}
