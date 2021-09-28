package com.example.demo.todo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.todo.Todo;
import com.example.demo.todo.service.TodoHandlerService;
import com.example.demo.todo.service.TodoJpaRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TodoJpaResource {

	@Autowired
	private TodoJpaRepository todorepository;

	@GetMapping("/jpa/users/{uname}/todos")
	public List<Todo> getAllTodos(@PathVariable String uname) {
		return todorepository.findByUname(uname);
//		return todorepository.findAll();
	}
//
	@DeleteMapping("/jpa/users/{uname}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String uname, @PathVariable long id) {
		todorepository.deleteById(id);
		return ResponseEntity.notFound().build();
	}

	@GetMapping("/jpa/users/{uname}/todos/{id}")

	public Todo getTodo(@PathVariable String uname, @PathVariable long id) {
		return todorepository.findById(id).get();
	}

	@PutMapping("/jpa/users/{uname}/todos/{id}")
	public ResponseEntity<Todo> updateTodo(@PathVariable String uname, @PathVariable long id,
			@RequestBody Todo todo) {
		todo.setUname(uname);

		Todo todoupdated = todorepository.save(todo);
		return new ResponseEntity<Todo>(todo, HttpStatus.OK);

	}

	@PostMapping("/jpa/users/{uname}/todos")
	public ResponseEntity<Void> createTodo(@PathVariable String uname, @RequestBody Todo todo) {
		todo.setUname(uname);
		
		Todo createdTodo = todorepository.save(todo);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

	
	
	
}