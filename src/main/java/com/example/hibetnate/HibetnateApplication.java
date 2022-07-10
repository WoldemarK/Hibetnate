package com.example.hibetnate;

import com.example.hibetnate.Service.DetailService;
import com.example.hibetnate.model.Detail;
import com.example.hibetnate.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

@SpringBootApplication
public class HibetnateApplication {
    public static void main(String[] args) {
        SpringApplication.run(HibetnateApplication.class, args);

    }

}
