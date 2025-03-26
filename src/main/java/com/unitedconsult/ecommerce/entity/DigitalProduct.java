package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class DigitalProduct extends Product {

    private String downloadLink;

    private String licenseKey;


    public DigitalProduct() {}

    public DigitalProduct(String name, double price, String downloadLink, String licenseKey) {
        super(name, price);
        this.downloadLink = downloadLink;
        this.licenseKey = licenseKey;
    }


    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    @Override
    public double getPrice() {
        float proportionOfPrice = 0.9f;
        return super.getPrice() * proportionOfPrice;
    }

    @Override
    public String toString() {
        return "DigitalProduct{" +
                "downloadLink='" + downloadLink + '\'' +
                ", licenseKey='" + licenseKey + '\'' +
                "} " + super.toString();
    }

}
