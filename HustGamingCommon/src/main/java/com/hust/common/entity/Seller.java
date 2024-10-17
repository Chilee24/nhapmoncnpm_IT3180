package com.hust.common.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Table(name="Sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SellerId")
    private int SellerId;
    @Column(name="SellerName")
    private String SellerName;
    @Column(name = "Email")
    private String email;
    @Column(name="PasswordHash")
    private String PasswordHash;
    @Column(name ="Phone")
    private String Phone;
    @Column(name="CreatedAt")
    private LocalDateTime CreatedAt;
    @Column(name="UpdatedAt")
    private LocalDateTime UpdatedAt;


    public void setSellerName(String sellerName) {
        this.SellerName=sellerName;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public void setPasswordHash(String s) {
        this.PasswordHash=s;
    }

    public void setPhone(String phone) {
        this.Phone=phone;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.CreatedAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.UpdatedAt = updatedAt;
    }

    public int getSellerId() {
        return this.SellerId;
    }

    public String getSellerName() {
        return this.SellerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPasswordHash() {
        return this.PasswordHash;
    }

    public String getPhone() {
        return this.Phone;
    }

    public LocalDateTime getCreatedAt() {
        return this.CreatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.UpdatedAt;
    }
}
