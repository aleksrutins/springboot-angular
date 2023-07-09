package com.example.springbootng.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbootng.domain.Todo;


public interface TodoRepository extends CrudRepository<Todo, Long> { }