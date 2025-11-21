package com.junaid.has_a_relation;

import java.util.*;

public class UpdateDriverScenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice (1 - Change Driver, 2 - No Change):");
        int choice = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter Car Brand:");
        String brand = sc.nextLine().trim();

        System.out.println("Enter Car Model:");
        String model = sc.nextLine().trim();

        System.out.println("Enter Manufacturing Year:");
        int year = Integer.parseInt(sc.nextLine().trim());

        System.out.println("Enter Driver Name:");
        String name = sc.nextLine().trim();

        System.out.println("Enter Driver Age:");
        int age = Integer.parseInt(sc.nextLine().trim());

        Cars car1 = new Cars(brand, model, year, new Driver(name, age));
        Cars car2 = new Cars(car1);

        switch (choice) {
            case 1 -> {
                System.out.println("Enter New Driver Name:");
                String newName = sc.nextLine().trim();

                System.out.println("Enter New Driver Age:");
                int newAge = Integer.parseInt(sc.nextLine().trim());

                car1.changeDriver(new Driver(newName, newAge));

                System.out.println("After Driver Update :");
                System.out.println(car1.toString1());
                System.out.println(car2.toString2());
            }
            case 2 -> {
                System.out.println("No Driver Change :");
                System.out.println(car1.toString1());
                System.out.println(car2.toString2());
            }
            default -> System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

class Driver {
    private String name;
    private int age;

    Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Driver(Driver other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
}

class Cars{
    private String brand;
    private String model;
    private int year;
    private Driver driver;

    Cars(String brand, String model, int year, Driver driver) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.driver = new Driver(driver);
    }

    Cars(Cars other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
        this.driver = new Driver(other.driver);
    }

    public void changeDriver(Driver newDriver) {
        this.driver = new Driver(newDriver);
    }

    public String toString1() {
        return "Car 1: " + brand + " " + model + " (" + year + "), Driver: "
                + driver.getName() + " (" + driver.getAge() + ")";
    }

    public String toString2() {
        return "Car 2: " + brand + " " + model + " (" + year + "), Driver: "
                + driver.getName() + " (" + driver.getAge() + ")";
    }
}
