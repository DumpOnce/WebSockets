package com.jproject.app;

import com.jproject.app.onfiguration.Config;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

@SpringBootApplication
@EnableAdminServer

public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
