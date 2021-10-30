package com.example.medidordefuerzacontrasea;

public class FizzBuzz {

    public String convert(int value) {

        boolean esMultiploDeTres = value %3 ==0;
        boolean esMultiploDeCinco= value %5 ==0;

        if(esMultiploDeTres && esMultiploDeCinco){
            return "FizzBuzz";
        }

        if(esMultiploDeTres){
            return"Fizz";
        }
        if (esMultiploDeCinco){
            return "Buzz";
        }

      return String.valueOf(value);
    }
}
