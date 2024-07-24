package com.example.RestAPI_TODO.Database;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DatabaseService {
	
	TodosDatabase todosdatabase;

	public DatabaseService(TodosDatabase todosdatabase) {
		this.todosdatabase = todosdatabase;
	}
	
	public List<Todos> showtodos(String name) {
		return todosdatabase.findByUsername(name);
	}
	
	public Todos showonetodos(int id) {
		return todosdatabase.findById(id);
	}
	
	public void deletetodos(int id) {
		todosdatabase.deleteById(id);
	}
	
	public void addtodos(Todos todos) {
		todosdatabase.save(todos);
	}
	public void updatetodos(Todos todos) {
		Todos foundtodo=todosdatabase.findById(todos.getId());
		foundtodo.setTitle(todos.getTitle());
		foundtodo.setDiscription(todos.getDiscription());
		foundtodo.setEnd_date(todos.getEnd_date());
		foundtodo.setDone(todos.getDone());
	}
	
	
}
