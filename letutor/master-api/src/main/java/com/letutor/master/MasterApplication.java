package com.letutor.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.letutor")
public class MasterApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(MasterApplication.class,args);
    }
}
