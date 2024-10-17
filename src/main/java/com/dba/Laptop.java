package com.dba;

public class Laptop implements Computer {

    public int ram;

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
