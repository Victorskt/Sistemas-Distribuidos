package com.greeting.ifms.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greeting.ifms.app.model.Soma;


@RestController
@RequestMapping(value = "/soma")

public class SomaController {
    
    @GetMapping("/{s1}/{s2}")
    public ResponseEntity<Double> add(@PathVariable("s1") Double s1, @PathVariable("s2") Double s2) {
        Soma new_soma = new Soma(s1, s2);
        return ResponseEntity.ok(new_soma.getSoma());
    }
}



    



