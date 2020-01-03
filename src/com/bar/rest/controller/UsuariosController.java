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
import com.bar.rest.dao.UsuariosDAO;
import com.bar.rest.model.Trago;
import com.bar.rest.model.Tragos;
import com.bar.rest.model.Usuario;
import com.bar.rest.model.Usuarios;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuariosController {
    @Value("${entrypoint.db.definition}")
    private String dbWay;
	
	@Autowired
	private UsuariosDAO usuariosDao;
	
    @GetMapping(path="/", produces = "application/json")
    public Usuarios getTragos()
    {
    	if("estatico".equals(dbWay)) {
    		
    		return usuariosDao.getAllusuarios();

    		
    	}else if("mysql".equals(dbWay)) {	
    		
    		return null;
    	
    	}else if("aws".equals(dbWay)){
    	
    		return null;
    	
    	}else {
    	
    		return null;
    	
    	}
    }
	
    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addTrago(@RequestBody Usuario usuario){
    	Integer id = usuariosDao.getAllusuarios().getListaUsuarios().size() + 1;
    	usuario.setId(id);
    	
    	usuariosDao.addUsuario(usuario);
    	
    	URI location = ServletUriComponentsBuilder.fromCurrentRequest()
    			.path("/{id}")
    			.buildAndExpand(usuario.getId())
    			.toUri();
    	
    	return ResponseEntity.created(location).build();
    }
    
}
