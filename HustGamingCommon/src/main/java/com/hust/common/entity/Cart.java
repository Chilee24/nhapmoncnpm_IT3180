package com.hust.common.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CartId")
    private int CartId;
    @Column(name="CustomerId")
    private int CustomerId;
    @Column(name="CreatedAt")
    private LocalDateTime CreatedAt;
    @Column(name="UpdatedAt")
    private LocalDateTime UpdatedAt;

}
