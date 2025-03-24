package com.unitedconsult.ecommerce.model;

public abstract class Product {

    private static int prevId = 0;

    private long id;

    private String name;

    private double price;

    public Product(String name) {
        prevId++;
        this.id = prevId;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
