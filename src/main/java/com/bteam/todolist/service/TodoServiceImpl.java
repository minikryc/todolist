package com.bteam.todolist.service;

import com.bteam.todolist.model.Todo;
import com.bteam.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> getAllTodos() {
        // Todo: 모든 할 일 목록 조회 구현
        return todoRepository.findAll();
    }

    @Override
    public Optional<Todo> getTodoById(Long id) {
        // Todo: 특정 id로 할 일 조회 구현
        return todoRepository.findById(id);
    }

    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
        // Todo: 할 일 등록 구현
    }

    @Override
    public void updateTodoById(Long id, Todo todo) {
        Todo temp_todo = todoRepository.findById(id).get();


        temp_todo.setTitle(todo.getTitle());
        temp_todo.setCompleted(todo.isCompleted());
        todoRepository.save(temp_todo);
        // Todo: 특정 id로 할 일 수정 구현
    }

    @Override
    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
        // Todo: 특정 id로 할 일 삭제 구현
    }
}