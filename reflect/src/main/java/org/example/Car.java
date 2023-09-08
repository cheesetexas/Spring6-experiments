package org.example;

import lombok.Data;

@Data
public class Car {
    private String name;
    private int age;
    private String color;

    public Car() {}
    public Car(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    private void run() {
        System.out.println("私有方法-run...");
    }
}
