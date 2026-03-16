package com.company.project.service;

import com.company.project.dto.Order;
import com.company.project.dto.Product;
import com.company.project.dto.Customer;

public class InventoryService {

    private final static String COMPANY_NAME = "HP";

    public void printProductDetails(Product product){
        System.out.println("Product id :" + product.getProductId());
        System.out.println("Product name :" +product.getProductName());
        System.out.println("Product price is: " +product.getPrice());
        System.out.println("Quality is :"+product.getQuality());
        System.out.println("Category is:"+product.getCategory());
    }
    public  void printCustomerDetails(Customer customer){
        System.out.println("Customer id :"+customer.getCustomerId());
        System.out.println("Customer name :" +customer.getName());
        System.out.println("Customer email :"+customer.getEmail());
        System.out.println("Customer phone :"+customer.getPhone());
    }
    public void printOrderDetails(Order order){
        System.out.println("Customer Name:" +order.getCustomer().getName());
        System.out.println("list is :");
        for(Product product :order.getProducts()){
            System.out.println(product.getProductName());
            System.out.println(product.getProductId());
        }
        System.out.println(order.calculateOrderValue());
    }
    public double calculateInventoryValue(Product[] products){
        double totalStockValue = 0;
        for(Product product : products){
            totalStockValue = totalStockValue + product.getQuality();
            System.out.println("Product name is :" +product.getProductName());
        }
        return totalStockValue;
    }
    public void findLowStockProducts(Product[] products){
        for (Product product :products){
            if (product.getQuality()<5){
                System.out.println(product.getProductName());
            }
        }
    }

}
