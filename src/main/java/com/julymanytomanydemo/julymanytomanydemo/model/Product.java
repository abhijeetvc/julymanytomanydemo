package com.julymanytomanydemo.julymanytomanydemo.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Product {

    @Id
    private Integer id;
    private String productName;

    @ManyToMany(mappedBy = "productList")
    List<Customer> customerList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
