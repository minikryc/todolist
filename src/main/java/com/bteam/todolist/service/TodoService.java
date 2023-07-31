package com.bteam.todolist.service;

import com.bteam.todolist.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();

    Todo getTodoById(Long id);

    void addTodo(Todo todo);

    void updateTodoById(Long id, Todo todo);

    void deleteTodoById(Long id);
}