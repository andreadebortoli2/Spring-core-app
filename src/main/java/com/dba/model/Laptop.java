package com.dba.model;

// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary // keyword used instead of qualifier
// @Scope("prototype")
public class Laptop implements Computer {

    public int ram;

    public Laptop() {
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("laptop compile");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}
