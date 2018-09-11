package com.abolkog.springboot.tut.todos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 09/09/2018 10:08 AM.
 */
@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {

    private List<Todo> data = Arrays.asList(
            new Todo(1, "First Todo", "This is the first todo"),
            new Todo(2, "Second Todo", "This is the first todo"),
            new Todo(3, "Third Todo", "This is the first todo"),
            new Todo(4, "Fourth Todo", "This is the first todo"),
            new Todo(5, "Fifth Todo", "This is the first todo"));

    @GetMapping(value = {"", "/"})
    public List<Todo> listTodos() {
        return data;
    }
}
