package com.example.Emp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

   @Bean
    public Address address() {
        return new Address("Bangalore", "Karnataka");
    }

   @Bean
    public GoldCustomer goldCustomer(Address address) {
        GoldCustomer goldCustomer = new GoldCustomer();
        goldCustomer.setId(101);
        goldCustomer.setName("Alex");
        goldCustomer.setAddress(address);
        return goldCustomer;
    }
}
