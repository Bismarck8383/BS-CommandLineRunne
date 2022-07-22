package com.bosonit.LineRunne.CommandLineRunne.beans;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class TerceraClase implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola desde la tercera clase");
        for (String msg: args) {
            System.out.println(msg);
        }
    }
}
