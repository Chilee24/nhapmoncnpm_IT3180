package com.hust.common.entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name ="Admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="AdminId")
    private Long AdminId;
    @Column (name="AdminName")
    private String AdminName;
    @Column (name="Email")
    private String Email;
    @Column(name="PasswordHash")
    private String PasswordHash;
    @Column(name="CreatedAt")
    private LocalDateTime CreatedAt;
    @Column(name ="UpdatedAt")
    public LocalDateTime UpdatedAt;

    public Admin(String adminName, String email, String passwordHash) {
        this.AdminName = adminName;
        this.Email = email;
        this.PasswordHash = passwordHash;
    }

    public Long getAdminId() {
        return this.AdminId;
    }

    public void setAdminId(Long adminId) {
        this.AdminId = adminId;
    }

    public String getAdminName() {
        return this.AdminName;
    }

    public void setAdminName(String adminName) {
        this.AdminName = adminName;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPasswordHash() {
        return this.PasswordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.PasswordHash = passwordHash;
    }

    public LocalDateTime getCreatedAt() {
        return this.CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.CreatedAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.UpdatedAt = updatedAt;
    }
}
