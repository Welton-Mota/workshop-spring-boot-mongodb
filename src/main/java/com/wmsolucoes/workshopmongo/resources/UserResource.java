package com.wmsolucoes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wmsolucoes.workshopmongo.domain.User;

// para indicar que a classe será um recurso Rest
@RestController
// para indicar qual sera o caminho do endpoint
@RequestMapping(value = "/users")
public class UserResource {

	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User welton = new User("1", "Welton Mota", "welton@gmail.com");
		User monique = new User("2", "Monique Mota", "monique@gmail.com");
		
		// ArrayList é uma implementação do List pois interface não se instancia.
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(welton, monique));
		return ResponseEntity.ok().body(list);
	}
}
