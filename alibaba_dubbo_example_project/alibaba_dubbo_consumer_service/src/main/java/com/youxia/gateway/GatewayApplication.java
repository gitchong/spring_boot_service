package com.youxia.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class GatewayApplication
{
    public static void main( String[] args )
    {
        SpringApplication application=new SpringApplication();
        application.run(GatewayApplication.class,args);
    }
}