package com.javabegin.syntax;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello git");

        Car car1 = new Car(2, "Subaru");
        Car car2 = new Car(3, "Nissan");
        Main main = new Main();

        main.test1(car1);
        main.test2(car1.getI());
        main.test4(car1,car2);
        car1.showInfo();
        car2.showInfo();


    }

    public void test1(Car car){
        car.setName("Toyota");
    }

    public void test2(int i){
        i = 6;
        System.out.println("test2.i = "+i);
    }

    public void test4(Car... cars){
        System.out.println("test4.cars.length = " + cars.length);
    }
}
