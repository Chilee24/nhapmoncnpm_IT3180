package com.hust.seller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TransactionID")
    private int transactionID;
    @Column(name="OrderID")
    private int orderID;
    @Column(name="PaymentMethod")
    private String paymentMethod;
    @Column(name="PaymentStatus")
    private String paymentStatus;
    @Column(name="PaymentDate")
    private LocalDateTime paymentDate;

    public Transaction(int orderID, String paymentMethod, String paymentStatus, LocalDateTime paymentDate) {
        this.orderID = orderID;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
    }
    public Transaction(){}
    public int getTransactionID() {
        return this.transactionID;
    }

    public int getOrderID() {
        return this.orderID;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public LocalDateTime getPaymentDate() {
        return this.paymentDate;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }


}
