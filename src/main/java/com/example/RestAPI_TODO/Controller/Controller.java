package com.example.RestAPI_TODO.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestAPI_TODO.Database.DatabaseService;
import com.example.RestAPI_TODO.Database.Todos;

import jakarta.validation.Valid;

@RestController
public class Controller {

	DatabaseService databaseservice;
	
	public Controller(DatabaseService databaseservice) {
		this.databaseservice = databaseservice;
	}

	@GetMapping("/auth")
	public String basicauth() {
		return "done";
	}
	
	@GetMapping("/users/{username}/todos")
	public List<Todos> showtodos(@PathVariable String username) {
		return databaseservice.showtodos(username);
	}
	
	@DeleteMapping("/todos/{id}")
	public void deletetodos(@PathVariable int id) {
		databaseservice.deletetodos(id);
	}
	
	@PostMapping("/todos")
	public void addtodos(@Valid @RequestBody Todos todos) {
		databaseservice.addtodos(todos);
	}
	
	@PutMapping("/todos")
	public void updatetodos(@Valid @RequestBody Todos todos) {
		databaseservice.updatetodos(todos);
	}
	
	@GetMapping("/todos/{id}")
	public Todos showonetodos(@PathVariable int id) {
		return databaseservice.showonetodos(id);
	}
	
	
}
