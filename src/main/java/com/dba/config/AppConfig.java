package com.dba.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Scope;
// import org.springframework.context.annotation.Primary;

import com.dba.Computer;
import com.dba.Desktop;
import com.dba.Developer;
import com.dba.Laptop;

@Configuration
public class AppConfig {

    @Bean
    public Developer developer(@Autowired @Qualifier("laptop") Computer computer) { // @Autowired keyword is optional
        Developer obj = new Developer();
        obj.setId(1);

        obj.setComputer(computer);

        return obj;
    }

    // @Bean(name = { "com1", "desk2" })
    @Bean
    // @Scope("prototype")
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    // @Primary is a keyword to use instead of qualifier in the constructor above
    public Laptop laptop() {
        return new Laptop();
    }
}
