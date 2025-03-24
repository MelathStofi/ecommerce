package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class SubscriptionProduct extends Product {

    private int billingCycle;

    private boolean autoRenewal;

    public SubscriptionProduct(String name) {
        super(name);
    }

    @Override
    public double getPrice() {

        return super.getPrice();
    }
}
