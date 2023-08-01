package com.bteam.todolist.service;

import com.bteam.todolist.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> getAllTodos();

    Optional<Todo> getTodoById(Long id);

    void addTodo(Todo todo);

    void updateTodoById(Long id, Todo todo);

    void deleteTodoById(Long id);
}