/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucle;

import java.io.IOException;

/**
 *
 * @author sebas
 */
public class Bucle {
    public static void main(String[] args) throws IOException{
        String resultado = "";
        
        int contador = 0;
        int numero = 1;
        while(contador < 100){
            if(esPrimo(numero)){
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 números primos son: \n"+resultado);
    }
    
    private static Boolean esPrimo(Integer numero){
        Boolean validacionNumeroPrimo = true;
        
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                validacionNumeroPrimo = false;
            }
        }
        
        if(validacionNumeroPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
        return validacionNumeroPrimo;
    }
}
