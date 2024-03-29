package br.com.todolist.todolist.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.todolist.todolist.entities.Todo;
import br.com.todolist.todolist.services.TodoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    public TodoController(@RequestBody TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);
    }

    @PutMapping
    List<Todo> update(@RequestBody @Valid Todo todo){
        return todoService.update(todo);
    }

    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") long id){
        return todoService.delete(id);
    }
}
