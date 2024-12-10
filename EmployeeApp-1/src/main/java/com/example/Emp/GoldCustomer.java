package com.example.Emp;

import org.springframework.stereotype.Component;

@Component  
public class GoldCustomer implements Customer {
    private int id;
    private String name;
    private Address address;  

   
    public void start() {
        System.out.println("START - INIT");
    }

    public void stop() {
        System.out.println("STOP - DESTROY");
    }

    @Override
    public String toString() {
        return id + ", " + name + " ," + address;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String getCustomerDetails() {
        return "New Gold customer";
    }
}