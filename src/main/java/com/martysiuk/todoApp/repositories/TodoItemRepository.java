package com.martysiuk.todoApp.repositories;

import com.martysiuk.todoApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
