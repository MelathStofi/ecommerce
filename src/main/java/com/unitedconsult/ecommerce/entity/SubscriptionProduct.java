package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class SubscriptionProduct extends Product {

    private int billingCycle;

    private boolean autoRenewal;

    public SubscriptionProduct(String name, int billingCycle, boolean autoRenewal) {
        super(name);
        this.billingCycle = billingCycle;
        this.autoRenewal = autoRenewal;
    }

    @Override
    public double getPrice() {

        return super.getPrice();
    }

    @Override
    public String toString() {
        return "SubscriptionProduct{" +
                "billingCycle=" + billingCycle +
                ", autoRenewal=" + autoRenewal +
                "} " + super.toString();
    }
}
