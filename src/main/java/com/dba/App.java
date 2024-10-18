package com.dba;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dba.config.AppConfig;
import com.dba.model.Desktop;
import com.dba.model.Developer;
import com.dba.model.Laptop;
import com.dba.service.LaptopService;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // XML based
        // @SuppressWarnings("resource")
        // ApplicationContext context = new
        // ClassPathXmlApplicationContext("spring-context.xml");

        // Developer dev1 = (Developer) context.getBean("developer");

        // System.out.println("Developer: " + dev1.getId());
        // dev1.code();

        // Developer dev2 = (Developer) context.getBean("developer");
        // dev2.setId(2);
        // System.out.println("Developer: " + dev2.getId());
        // dev2.code();

        // Laptop laptop1 = (Laptop) context.getBean("computer");
        // System.out.println(laptop1.ram);

        // Laptop laptop2 = context.getBean("computer", Laptop.class);
        // System.out.println(laptop2.ram);

        // Desktop desktop = context.getBean(Desktop.class);

        // JAVA based
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Developer dev1 = context.getBean("developer", Developer.class);
        System.out.println("Developer: " + dev1.getId());
        dev1.code();

        Desktop desktop1 = context.getBean(Desktop.class);
        // Desktop desktop2 = context.getBean(Desktop.class);
        // Desktop desktop = context.getBean("desktop",Desktop.class);
        // Desktop desktop = context.getBean("com1",Desktop.class);
        desktop1.compile();
        // desktop2.compile();

        LaptopService service = context.getBean(LaptopService.class);

        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);

        // SERVLET
        System.out.println("------");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080); // optional

        Context ctx = tomcat.addContext("", null);
        Tomcat.addServlet(ctx, "hs", new HelloServlet());
        ctx.addServletMappingDecoded("/hello", "hs");

        try {
            tomcat.start();
            System.out.println("**servelt started**");
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            System.out.println("cannot start tomcat servlet");
        }
    }
}
