package com.thinksworks.overriding.external;

public class PersonDetails {

    public PersonDetails(){

    }
     PersonDetails(String name){
        System.out.println("Name is:"+name);
    }
     PersonDetails(String name,int age){
        System.out.println("Name is :"+name +"Age is:"+age);
    }
     PersonDetails(String name,int age,String location){
        System.out.println("Name  is :"+name +"Age is:"+age+"Location is:"+location);
    }
    PersonDetails(String name,int age,String location,double height) {
        System.out.println("Name  is :" + name + "Age is:" + age + "Location is:" + location + "Height is:" + height);
    }
     public PersonDetails(String name,int age,String location,double height,int weight) {
        System.out.println("Name  is :" + name + "  " +"Age is:" + age + " "+ "Location is:" + location + "  "+ "Height is:" + height+"  "+ "Weight is:"+weight);
    }

}
