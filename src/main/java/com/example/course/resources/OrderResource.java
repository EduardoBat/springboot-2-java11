package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Order;
import com.example.course.services.OrderService;

@RestController 
@RequestMapping(value = "/orders") // nome para meu recurso
public class OrderResource {

	@Autowired
	private OrderService service;  
	
	
	@GetMapping //para indicar que esse método, responde o tipo get do http
	public ResponseEntity<List<Order>> findAll() { // retorna respostas de requisições web

		
		List<Order>list = service.findAll();
		
		
		return ResponseEntity.ok().body(list); 

	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		
		
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	
	
	
	

}
