package com.tienda.skate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendaskateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TiendaskateApplication.class, args);
        System.out.println("estoy corriendo en el puerto8080");
    }

}
