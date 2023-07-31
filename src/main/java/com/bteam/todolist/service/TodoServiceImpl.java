package com.bteam.todolist.service;

import com.bteam.todolist.model.Todo;
import com.bteam.todolist.repository.TodoRepository;
import com.bteam.todolist.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAllTodos() {
        // Todo: 모든 할 일 목록 조회 구현
        return null;
    }

    @Override
    public Todo getTodoById(Long id) {
        // Todo: 특정 id로 할 일 조회 구현
        return null;
    }

    @Override
    public void addTodo(Todo todo) {
        // Todo: 할 일 등록 구현
    }

    @Override
    public void updateTodoById(Long id, Todo todo) {
        // Todo: 특정 id로 할 일 수정 구현
    }

    @Override
    public void deleteTodoById(Long id) {
        // Todo: 특정 id로 할 일 삭제 구현
    }
}