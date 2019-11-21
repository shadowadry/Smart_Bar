package com.bar.rest.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.bar.rest.model.Trago;
import com.bar.rest.model.Tragos;

@Repository
public class TragosDAO {
	private static Tragos list = new Tragos();
	
	@Bean
	private AWSCredentials amazonAWSCredentials() {
	    return new BasicAWSCredentials("", "");
	}
	
	
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
