package com.company.project.runner;

import com.company.project.dto.Customer;
import com.company.project.dto.Order;
import com.company.project.dto.Product;
import com.company.project.service.InventoryService;

public class MainRunner {

    public static void main(String[] args) {
       Customer customer = new Customer(12,"rudresh","rudreshhp@gmail.com","1234");
       Product product = new Product(123,"rudresh",123.4d,65,"Fresher");
       Product product1 = new Product(32,"Harsha",87.6d,2,"fresher");
       Product[] products = {product,product1 };
        Order order = new Order(12,customer,products,2);
        InventoryService inventoryService = new InventoryService();
        inventoryService.printProductDetails(product);
        inventoryService.printCustomerDetails(customer);
        inventoryService.printOrderDetails(order);
        inventoryService.calculateInventoryValue(products);
        inventoryService.findLowStockProducts(products);

    }
}
