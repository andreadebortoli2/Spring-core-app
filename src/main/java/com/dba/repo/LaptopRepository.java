package com.dba.repo;

import org.springframework.stereotype.Repository;

import com.dba.model.Laptop;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("saved in database");
    }
}
