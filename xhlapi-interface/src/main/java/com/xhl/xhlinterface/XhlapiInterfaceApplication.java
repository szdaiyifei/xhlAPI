package com.xhl.xhlinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XhlapiInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhlapiInterfaceApplication.class, args);
    }

}
