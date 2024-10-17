package com.hust.seller.entity;

import jakarta.persistence.*;

@Entity

@Table(name="OrderDetails")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="OrderDetailID")
    private int orderDetailID;
    @Column(name="OrderID")
    private int orderID;
    @Column(name="ProductID")
    private int productID;
    @Column(name="Quantity")
    private  int quantity;
    @Column(name="UnitPrice")
    private int unitPrice;

    public OrderDetail(int orderID, int productID, int quantity, int unitPrice) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
public OrderDetail(){}
    public int getOrderID() {
        return orderID;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
