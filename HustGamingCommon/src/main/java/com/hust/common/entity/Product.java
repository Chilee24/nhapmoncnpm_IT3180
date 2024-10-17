package com.hust.common.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProductId")
    private int ProductId;
    @Column(name="ProductName")
    private String ProductName;
    @Column(name="Price")
    private  Long Price;
    @Column(name="Stock")
    private int Stock;
    @Column(name="CategoryId")
    private int CategoryId;
    @Column(name="SellerId")
    private int SellerId;
}
