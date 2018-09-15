package com.abolkog.springboot.tut.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 09/09/2018 10:08 AM.
 */
@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;


    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Todo>> getAllTodos() {

        List<Todo> result =  todoService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable  String id) {

        Todo result =  todoService.getById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }

    @PostMapping(value = {"", "/"})
    public ResponseEntity<Todo> createNewTodo(@Valid @RequestBody Todo todo) {
        Todo result = todoService.save(todo);

        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {

        todoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
