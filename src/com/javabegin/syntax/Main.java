package com.javabegin.syntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello git");

        Car car1 = new Car(1, "Subaru");
        car1.showInfo();


    }

    public void test1(Car car){
        car.setName("Toyota");
    }
}
