package com.unitedconsult.ecommerce;

import com.unitedconsult.ecommerce.entity.DigitalProduct;
import com.unitedconsult.ecommerce.entity.SubscriptionProduct;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        //SpringApplication.run(EcommerceApplication.class, args);

        var digitalProd = new DigitalProduct("ebook");
        var subProd = new SubscriptionProduct("Jetbrains");
        System.out.println(digitalProd.getId());
        System.out.println(subProd.getId());
    }

}
