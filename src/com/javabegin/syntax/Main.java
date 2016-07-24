package com.javabegin.syntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello git");

        Car car1 = new Car(1, "Subaru");
        Main main = new Main();

        main.test1(car1);
        car1.showInfo();


    }

    public void test1(Car car){
        car.setName("Toyota");
    }
}
