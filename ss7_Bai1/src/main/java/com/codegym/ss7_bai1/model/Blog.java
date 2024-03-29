package com.codegym.ss7_bai1.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;


import java.time.LocalDate;


@Entity
@Table(name = "blogs")

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private LocalDate dateCreate;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Blog() {
    }

    public Blog(String title, String content, LocalDate dateCreate) {
        this.title = title;
        this.content = content;
        this.dateCreate = dateCreate;
    }

    public Blog(String title, String content, LocalDate dateCreate, Category category) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, title='%s', content='%s']", id, title, content);
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

}
