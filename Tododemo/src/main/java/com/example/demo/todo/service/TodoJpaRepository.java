package com.example.demo.todo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.todo.Todo;
@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	
List<Todo> findByUname(String uName);

}
