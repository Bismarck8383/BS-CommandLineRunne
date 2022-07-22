package com.bosonit.LineRunne.CommandLineRunne.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClaseInicial {
    // EL metodo @PostConstruct se ejecuta primero
    @PostConstruct
    public void MensajeInicial(){
        System.out.println("Hola desde la clase inicial");
    }
    //    @PreDestroy  Se Ejecutara al final del programa
    @PreDestroy
    public  void MensajeFinal(){
        System.out.println("Final.........");
    }

}
