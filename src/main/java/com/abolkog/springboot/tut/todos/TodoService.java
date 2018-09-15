package com.abolkog.springboot.tut.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 11/09/2018 9:16 PM.
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;


    /**
     * Get all todos
     * @return List of todos
     */
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo getById(String id) {
        return todoRepository.findById(id).get();
    }

    public Todo save(Todo todo) {
        return todoRepository.insert(todo);
    }

    public void delete(String id) {
       todoRepository.deleteById(id);
    }
}
