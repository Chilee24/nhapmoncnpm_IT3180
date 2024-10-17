package com.hust.common.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CategoryId")
    private int CategoryId;
    @Column(name="CategoryName")
    private String CategoryName;

}
