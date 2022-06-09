package com.wmsolucoes.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wmsolucoes.workshopmongo.domain.User;
import com.wmsolucoes.workshopmongo.services.UserService;

// para indicar que a classe será um recurso Rest
@RestController
// para indicar qual sera o caminho do endpoint
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		
		// ArrayList é uma implementação do List pois interface não se instancia.
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
