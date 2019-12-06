package com.bar.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.SpringVersion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bar.rest.dao.TragosDAO;
import com.bar.rest.model.Trago;
import com.bar.rest.model.Tragos;

@RestController
@RequestMapping(path = "/tragos")
public class TragosController {
    @Value("${entrypoint.db.definition}")
    private String dbWay;
	
	@Autowired
	private TragosDAO tragosDao;
	
    @GetMapping(path="/", produces = "application/json")
    public Tragos getEmployees() 
    {
    	if("estatico".equals(dbWay)) {
    		
    		return tragosDao.getAllTragos();
    		
    	}else if("mysql".equals(dbWay)) {	
    		
    		return null;
    	
    	}else if("aws".equals(dbWay)){
    	
    		return null;
    	
    	}else {
    	
    		return null;
    	
    	}
    }
	
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addTrago(@RequestBody Trago trago){
    	Integer id = tragosDao.getAllTragos().getListaTragos().size() + 1;
    	trago.setId(id);
    	
    	tragosDao.addTrago(trago);
    	
    	URI location = ServletUriComponentsBuilder.fromCurrentRequest()
    			.path("/{id}")
    			.buildAndExpand(trago.getId())
    			.toUri();
    	
    	return ResponseEntity.created(location).build();
    }
}
