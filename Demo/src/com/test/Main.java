package com.test;

import java.util.*;

record Product(String name,Double price){

}
public class Main {
    public static void main(String[] args) {
    
       int n =Integer.parseInt(IO.readln("Enter no of Products:"));
       List<Product> listOfProduct = new ArrayList<>();
       for(int i = 0;i<n;i++){
         String name = IO.readln();
          double price =Double.parseDouble(IO.readln());

        listOfProduct.add(new Product(name,price));

       }   
       IO.println("Logged Output:");

     listOfProduct.stream().forEach(pr->{
        IO.println(pr.name()+" : "+pr.price());
     });
      
    }
}