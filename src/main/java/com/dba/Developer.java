package com.dba;

// import java.beans.ConstructorProperties;

public class Developer {

    private int id;
    // private Laptop laptop = new Laptop();
    private Computer computer;

    // @ConstructorProperties({ "id", "computer" })
    // public Developer(int id, Computer computer) {
    // this.id = id;
    // this.computer = computer;
    // }

    public Developer() {
        System.out.println("Developer Object Created");
    }

    public void code() {
        System.out.println("coding..");
        computer.compile();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
