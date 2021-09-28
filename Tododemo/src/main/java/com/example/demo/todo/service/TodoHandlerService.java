package com.example.demo.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.todo.Todo;

@Service
public class TodoHandlerService {
private static List<Todo> todos=new ArrayList();
private static long idCounter = 0;
static {
	todos.add(new Todo(idCounter++,"Karthik","Learn MicroServices",new Date(),false));
	todos.add(new Todo(idCounter++,"Karthik","Learn UnitTesting",new Date(),false));
	todos.add(new Todo(idCounter++,"Karthik","Learn React",new Date(),false));


}

public Todo save(Todo todo) {
	if(todo.getId()==-1|| todo.getId()==0) {
		todo.setId(++idCounter);
		todos.add(todo);

	}
	else {
		deletebyId(todo.getId());
		todos.add(todo);
	}
	return todo;
}
public List<Todo> findAll() {
	return todos;
}
public Todo deletebyId(long Id ) {
	Todo todo=findById(Id);
	
	if(todo==null) return null;
	if(todos.remove(todo)) {
		return todo;
	}
	return null;
	
	
}
public Todo findById(long id) {
	for(Todo todo:todos){
		if(todo.getId()==id)
		
		return todo;
	}
	return null;
}
}
