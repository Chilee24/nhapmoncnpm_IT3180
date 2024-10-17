package com.hust.seller.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Reviews")
public class Review {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ReviewID")
    private int reviewID;
    @Column(name="ProductID")
    private int productID;
    @Column(name="BuyerID")
    private int buyerID;
    @Column(name="Rating")
    private int rating;
    @Column(name="Comment")
    private String comment;
    @Column(name="ReviewDate")
    private LocalDateTime reiewDate;

    public Review(int productID, int buyerID, String comment) {
        this.productID = productID;
        this.buyerID = buyerID;
        this.comment = comment;
    }
    public Review(){}
    public int getReviewID() {
        return reviewID;
    }

    public int getProductID() {
        return productID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getReiewDate() {
        return reiewDate;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setReiewDate(LocalDateTime reiewDate) {
        this.reiewDate = reiewDate;
    }
}
