package com.dba.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// import java.beans.ConstructorProperties;

@Component
public class Developer {

    @Value("1")
    private int id;
    // private Laptop laptop = new Laptop();
    // @Autowired // field injection ***
    // @Qualifier("laptop")
    private Computer computer;

    // @ConstructorProperties({ "id", "computer" })
    // public Developer(int id, Computer computer) { //constructor injection ***
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

    @Autowired // setter injection *** preferred ***
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

}
