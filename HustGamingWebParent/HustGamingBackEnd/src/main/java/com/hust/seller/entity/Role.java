package com.hust.seller.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="RoleID")
    private int roleID;
    @Column(name="Role_name")
    private String roleName;
    public Role(){}
    public int getRoleID() {
        return this.roleID;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    @ManyToMany(mappedBy = "roles")  // Quan hệ nhiều-nhiều với User
    private Set<User> users;


}
