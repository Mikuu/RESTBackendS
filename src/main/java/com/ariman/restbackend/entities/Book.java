package com.ariman.restbackend.entities;

public class Book {
    private String bid;
    private String title;
    private String author;
    private int price;
    private String publishedAt;

    public Book(String bid, String title, String author, int price, String publishedAt) {
        this.bid = bid;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishedAt = publishedAt;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
