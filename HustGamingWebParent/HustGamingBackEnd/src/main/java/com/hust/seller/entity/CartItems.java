package com.hust.seller.entity;

import jakarta.persistence.*;

@Entity
@Table(name="CartItems")
public class CartItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CartItemID")
    private int cartItemID;
    @Column(name="CartID")
    private int cartID;
    @Column(name="ProductID")
    private int productID;
    @Column(name="QuantityID")
    private int quantityID;

    public CartItems(int cartID, int productID, int quantityID) {
        this.cartID = cartID;
        this.productID = productID;
        this.quantityID = quantityID;
    }
    public CartItems(){}

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantityID() {
        return quantityID;
    }

    public void setQuantityID(int quantityID) {
        this.quantityID = quantityID;
    }
}
