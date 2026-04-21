package com.thinksworks.overriding.external;

public class Phone {

      void Phone() {
    }
      void Phone(String name){

        System.out.println("Name is:"+name);
    }
      void phoneDetails(String name, int cost){

          System.out.println("Name is :"+name +"Age is:"+cost);
    }
     void phoneDetails(String name, int cost, String location){
        System.out.println("Name  is :"+name +"Age is:"+cost+"Location is:"+location);
    }
     void phoneDetails(String name, int cost, String location, double ram) {
        System.out.println("Name  is :" + name + "Age is:" + cost + "Location is:" + location + "ram is:" + ram);
    }
     public  void phoneDetails(String name, int cost, String location, double ram, int storage) {
        System.out.println("Name  is :" + name + "  " +"cost is:" + cost + " "+ "Location is:" + location + "  "+ "ram is:" + ram+"  "+ "storage is:"+storage);
    }

}
