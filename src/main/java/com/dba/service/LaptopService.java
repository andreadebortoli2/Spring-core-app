package com.dba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dba.model.Laptop;
import com.dba.repo.LaptopRepository;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop laptop) {
        repo.save(laptop);
    }

}
