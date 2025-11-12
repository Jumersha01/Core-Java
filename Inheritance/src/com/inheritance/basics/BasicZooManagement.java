package com.inheritance.basics;


import java.util.*;
public class BasicZooManagement{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice :");
        int choice = Integer.parseInt(sc.nextLine());
        if(choice==1){
            Animal a = new Animal();
            a.eat();
        }
        else if(choice==2){
            Mammal m = new Mammal();
            m.walk();
        }
        else if(choice==3){
            Dog d = new Dog();
            d.bark();
        }
        else{
            System.out.println("Invalid choice!");
            System.exit(0);
        }

    }
}
class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Mammal  extends Animal {
   public void walk(){
    System.out.println("Mammal is walking");
   }
}
class Dog extends Mammal{
    public void bark(){
        System.out.println("Dog is barking");
    }
}