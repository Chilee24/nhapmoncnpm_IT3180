package com.hust.seller.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CartID")
    private int cartID;
    @Column(name="CustomerID")
    private String customerID;
    @Column(name="CreatedAt")
    private LocalDateTime ceatedAt;

   public Cart(){}

    public Cart(String customerID, LocalDateTime ceatedAt) {
        this.customerID = customerID;
        this.ceatedAt = ceatedAt;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public LocalDateTime getCeatedAt() {
        return ceatedAt;
    }

    public void setCeatedAt(LocalDateTime ceatedAt) {
        this.ceatedAt = ceatedAt;
    }


}
