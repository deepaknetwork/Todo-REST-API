package com.example.RestAPI_TODO.Database;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Todos {

@Id
@GeneratedValue
private int id;
@Size(min=3,message="username atleast 3 characters")
private String username;
@Size(min=3,message="title atleast 3 characters")
private String title;
@Size(min=3,message="discription atleast 3 characters")
private String discription;
@NotNull
private LocalDate end_date;
@NotNull
private Boolean done;
public Todos(int id,String username, String title, String discription, LocalDate end_date, Boolean done) {
	super();
	this.id = id;
	this.username=username;
	this.title = title;
	this.discription = discription;
	this.end_date = end_date;
	this.done = done;
}
public Todos() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public LocalDate getEnd_date() {
	return end_date;
}
public void setEnd_date(LocalDate end_date) {
	this.end_date = end_date;
}
public Boolean getDone() {
	return done;
}
public void setDone(Boolean done) {
	this.done = done;
}

}
