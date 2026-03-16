package com.company.project.dto;

public class Order {

      private int orderId;
      private Customer customer;
      private Product[] products;
      private int productCount;

    public Order(int orderId, Customer customer, Product[] products, int productCount) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
        this.productCount = productCount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
    public double calculateOrderValue(){
        double totalOrderValue =0;
        for( Product product : products){
          totalOrderValue = totalOrderValue + product.getPrice();
        }
        return totalOrderValue;
    }
}
