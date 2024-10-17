package com.dba;

import java.beans.ConstructorProperties;

public class Developer {

    private int age;
    // private Laptop laptop = new Laptop();
    private Laptop laptop;

    @ConstructorProperties({ "age", "laptop" })
    public Developer(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public void code() {
        laptop.compile();
        System.out.println("coding..");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
