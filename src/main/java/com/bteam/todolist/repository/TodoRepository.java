package com.bteam.todolist.repository;

import com.bteam.todolist.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    // Todo: 구현해야 할 추가 메소드 (검색, 필터링 등)

    List<Todo> findByTitle(String title);
    //필터링


}