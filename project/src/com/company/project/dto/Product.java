package com.company.project.dto;

public class Product {

    private int productId;
    private String productName;
    private  double price;
    private int quality;
    private String category;

    public Product(int productId, String productName, double price, int quality, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quality = quality;
        this.category = category;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuality(){
        return quality;
    }
    public void setQuality(int quality){
        this.quality = quality;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public double calculateStockValue(){
        return price * quality;
    }

}
