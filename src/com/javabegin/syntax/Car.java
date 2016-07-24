package com.javabegin.syntax;

public class Car {

    private int i = 0;
    private String name = null;

    public Car() {
    }

    public Car(int i, String name) {
        this.i = i;
        this.name = name;
    }


    public int getI() {
        return i;
    }

    public String getName() {
        return name;
    }

    private void test(){
        i=5;
    }

    public void go(){
        int count = 0;
        count++;
        System.out.println(i);
    }

    public void showInfo(){
        System.out.println("i = "+this.getI()+" name = "+this.getName());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (!name.equals(car.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
