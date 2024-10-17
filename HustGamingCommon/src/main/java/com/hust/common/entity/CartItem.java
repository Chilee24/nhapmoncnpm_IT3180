package com.hust.common.entity;


import jakarta.persistence.*;

@Entity
@Table(name="CartItems")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CartItemId")
    private Long CartItemId;
    @Column(name="CartId")
    private int CartId;
    @Column(name="ProductId")
    private int ProductId;
    @Column(name="QuantityId")
    private int QuantityId;

}
