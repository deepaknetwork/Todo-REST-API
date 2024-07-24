package com.example.RestAPI_TODO;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.RestAPI_TODO.Database.Todos;
import com.example.RestAPI_TODO.Database.TodosDatabase;

@Component
public class Runner implements CommandLineRunner {
	
	TodosDatabase tododatabase;
	
	public Runner(TodosDatabase tododatabase) {
		this.tododatabase = tododatabase;
	}

	@Override
	public void run(String... args) throws Exception {
		tododatabase.save(new Todos(1,"dpk","new year","bath and go temple",LocalDate.now().plusMonths(2),false));
		tododatabase.save(new Todos(2,"dpk","learn","to finish spring",LocalDate.now().plusMonths(2),false));
		tododatabase.save(new Todos(3,"deepak","one","bath and go temple",LocalDate.now().plusMonths(2),false));
		tododatabase.save(new Todos(4,"deepak","two","to finish spring",LocalDate.now().plusMonths(2),false));
	}

}
