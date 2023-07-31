package com.bteam.todolist.controller;

import com.bteam.todolist.model.Todo;
import com.bteam.todolist.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String getTodoList(Model model) {
        // Todo: 할 일 목록 조회 구현
        return "index";
    }

    @GetMapping("/todo/{id}")
    public String getTodoDetail(@PathVariable Long id, Model model) {
        // Todo: 할 일 상세 조회 구현
        return "todo_detail";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        // Todo: 할 일 등록 구현
        return "redirect:/";
    }

    @PostMapping("/update/{id}")
    public String updateTodo(@PathVariable Long id, @ModelAttribute Todo todo) {
        // Todo: 할 일 수정 구현
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        // Todo: 할 일 삭제 구현
        return "redirect:/";
    }
}