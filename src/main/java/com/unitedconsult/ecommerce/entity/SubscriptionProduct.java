package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class SubscriptionProduct extends Product {

    private int billingCycle;

    private boolean autoRenewal;


    public SubscriptionProduct() {}

    public SubscriptionProduct(String name, double price, int billingCycle, boolean autoRenewal) {
        super(name, price);
        this.billingCycle = billingCycle;
        this.autoRenewal = autoRenewal;
    }


    public int getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(int billingCycle) {
        this.billingCycle = billingCycle;
    }

    public boolean isAutoRenewal() {
        return autoRenewal;
    }

    public void setAutoRenewal(boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
    }

    @Override
    public double getPrice() {
        return autoRenewal ? super.getPrice() * 0.9 : super.getPrice();
    }

    @Override
    public String toString() {
        return "SubscriptionProduct{" +
                "billingCycle=" + billingCycle +
                ", autoRenewal=" + autoRenewal +
                "} " + super.toString();
    }

}
