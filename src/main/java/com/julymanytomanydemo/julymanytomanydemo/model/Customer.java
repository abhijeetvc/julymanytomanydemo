package com.julymanytomanydemo.julymanytomanydemo.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    private Integer id;
    private String customerName;


    @ManyToMany
    @JoinTable(name = "customer_product",
            joinColumns = @JoinColumn(name = "cust_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"))
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
