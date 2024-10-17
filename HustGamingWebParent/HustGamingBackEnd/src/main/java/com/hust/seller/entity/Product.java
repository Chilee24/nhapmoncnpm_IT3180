package com.hust.seller.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="ProductID")
    private int productID;
    @Column(name="ProductName")
    private String productName;
    @Column(name="Description")
    private String description;
    @Column(name="Price")
    private int price;
    @Column(name="Quantity")
    private int quantity;
    @Column(name="CategoryID")
    private int categoryID;
    @Column(name="SellerID")
    private int sellerID;
    @Column(name="CreatedDate")
    private LocalDateTime ceatedDate;

    public Product(String productName, String description, int price, int quantity, int categoryID, int sellerID) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.categoryID = categoryID;
        this.sellerID = sellerID;
    }
    public Product(){}

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public LocalDateTime getCeatedDate() {
        return ceatedDate;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public void setCeatedDate(LocalDateTime ceatedDate) {
        this.ceatedDate = ceatedDate;
    }
}



