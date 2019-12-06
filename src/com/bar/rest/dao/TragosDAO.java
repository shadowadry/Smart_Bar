package com.bar.rest.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.bar.rest.model.Trago;
import com.bar.rest.model.Tragos;

@Repository
public class TragosDAO {
	private static Tragos list = new Tragos();
	
  @Value("${entrypoint.db.definition}")
  private String entryPointDBdefinition;
	
    static
    {
        list.getListaTragos().add(new Trago(1, "Fernet", new Double(5.3), "coca"));
        list.getListaTragos().add(new Trago(1, "Daikiri", new Double(5), "No disponible"));
        list.getListaTragos().add(new Trago(1, "Gancia", new Double(5.3), "No disponible"));
    }
	
    public Tragos getAllTragos() {
    	return list;
    }
    
    public void addTrago(Trago trago) {
    	list.getListaTragos().add(trago);
    }
    
    
    
}
