package com.hust.common.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ProductDetails")
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ProductDetailId")
    private int ProductDetailId;
    @Column(name="ProductId")
    private int ProductId;
    @Column(name="Description")
    private String Description;
    @Column(name="Specifications")
    private String Specification;
    @Column(name="WarrantyPeriod")
    private int WarrantyPeriod;


}
