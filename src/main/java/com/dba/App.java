package com.dba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        Developer dev1 = (Developer) context.getBean("developer");
        dev1.setAge(5);
        ;
        System.out.println(dev1.getAge());
        dev1.code();

        Developer dev2 = (Developer) context.getBean("developer");
        System.out.println(dev2.getAge());
        dev2.code();

        Laptop laptop1 = (Laptop) context.getBean("laptop");
        System.out.println(laptop1.ram);

        Laptop laptop2 = (Laptop) context.getBean("laptop");
        System.out.println(laptop2.ram);
    }
}
