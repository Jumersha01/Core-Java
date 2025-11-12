package com.inheritance.basics;

import java.util.*;
class Animal1{
    private String name;

    Animal1(String name){
        this.name= name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getName(){
        return this.name;
    }

}

class Mammal1 extends Animal1{
    private boolean hasFur;
    Mammal1(String name,boolean hasFur){
        super(name);
        this.hasFur=hasFur;
    }
    public void setFur(boolean fur){
        this.hasFur =fur;
}
public boolean getFur(){
    return this.hasFur;
}
}
class Dog1 extends Mammal1{
    private String breed;
    
    Dog1(String name,boolean hasFur,String breed){
        super(name,hasFur);
        this.breed = breed;
    }
    public void  setBreed(String breed){
    this.breed = breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public String toString(){
        return "Dog [getName()="+this.getName()+", isHasFur()="+this.getFur()+", breed="+getBreed()+"]";
    }
}


public class ZooManagement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
       String name = sc.next();
       
       System.out.print("Enter hasFur: ");
       boolean hsfur = sc.nextBoolean();
       //Boolean.parseBoolean(sc.nextLine());
       System.out.print("Enter breed: ");
       String breed  = sc.next();
       
       Dog1 d = new Dog1(name,hsfur,breed);
       System.out.println(d.toString());
    }
}
