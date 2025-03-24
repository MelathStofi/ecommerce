package com.unitedconsult.ecommerce.entity;

import com.unitedconsult.ecommerce.model.Product;

public class DigitalProduct extends Product {

    private String downloadLink;

    private String licenseKey;


    public DigitalProduct(String name, String downloadLink, String licenseKey) {
        super(name);
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
    public String toString() {
        return "DigitalProduct{" +
                "downloadLink='" + downloadLink + '\'' +
                ", licenseKey='" + licenseKey + '\'' +
                "} " + super.toString();
    }
}
