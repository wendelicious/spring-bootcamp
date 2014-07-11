package com.dietsodasoftware.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Hello world!
 *
 */
@ComponentScan
@EnableAutoConfiguration
//@EnableWebMvc
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
