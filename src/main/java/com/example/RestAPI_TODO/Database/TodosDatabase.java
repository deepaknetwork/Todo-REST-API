package com.example.RestAPI_TODO.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosDatabase extends JpaRepository<Todos,Integer> {
public List<Todos> findByUsername(String name);
public Todos findById(int id);
}
