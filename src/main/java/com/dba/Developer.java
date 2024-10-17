package com.dba;

import java.beans.ConstructorProperties;

public class Developer {

    private int age;
    // private Laptop laptop = new Laptop();
    private Computer computer;

    // @ConstructorProperties({ "age", "computer" })
    // public Developer(int age, Computer computer) {
    // this.age = age;
    // this.computer = computer;
    // }

    public void code() {
        System.out.println("coding..");
        computer.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
