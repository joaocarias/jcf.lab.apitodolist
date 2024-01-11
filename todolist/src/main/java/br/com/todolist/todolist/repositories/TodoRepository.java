package br.com.todolist.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.todolist.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}
