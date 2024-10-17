package com.hust.seller.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CategoryId")
    private int categoryId;
    @Column(name="CategoryName")
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
    public Category(){}

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
