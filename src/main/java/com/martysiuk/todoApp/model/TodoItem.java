package com.martysiuk.todoApp.model;

import jakarta.persistence.Entity;//w dep-cies like jpa
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class TodoItem {

    @Id
            @GeneratedValue

    private Long id;
    private String title; //what is in each todo

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TodoItem(String title) {
        this.title = title;
    }

    public TodoItem() {
    }







}
