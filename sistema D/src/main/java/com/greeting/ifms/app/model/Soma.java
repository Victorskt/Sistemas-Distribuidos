package com.greeting.ifms.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Soma {
    

     private Double primeiroNum;
     private Double segundoNum;


     public Double getSoma(){
        return  primeiroNum + segundoNum;
      
     }
}
