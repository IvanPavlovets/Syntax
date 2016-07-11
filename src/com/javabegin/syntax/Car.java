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
        this.getI();
        this.getName();
    }




}
