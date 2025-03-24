package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class PhysicalProduct extends Product {

    private double weight;

    private double length;

    private double width;

    private double height;


    public PhysicalProduct(String name, double weight, double length, double width, double height) {
        super(name);
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PhysicalProduct{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
