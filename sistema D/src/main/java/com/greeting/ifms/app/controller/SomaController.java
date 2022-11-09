package com.greeting.ifms.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/soma")

public class SomaController {
    
    @GetMapping("/{s1}/{s2}")
    public ResponseEntity<Double> add(@PathVariable("s1") String s1, @PathVariable("s2") String s2) {

        double number1 = 0;
        double number2 = 0;

         try{

            number1 = Double.parseDouble(s1);   
            number2 = Double.parseDouble(s2);

         }catch(NumberFormatException e){

            throw new ArithmeticException("É proibido letras, Por Favor tente novamente");
         }

         return ResponseEntity.ok(number1 + number2);
        
    }

}


    



