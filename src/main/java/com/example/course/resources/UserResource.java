package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController
@RequestMapping(value = "/users") // nome para meu recurso
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() { // retorna respostas de requisições web

		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);

	}

}
