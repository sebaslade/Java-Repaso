/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sebas
 */
public class Main {
    public static void main(String[] args) throws IOException{
        // Con este código pedimos un número
        System.out.println("Ingrese el primer número:");
        Integer numero = cargarNumero();
        
        Boolean esPar = (numero % 2) == 0;
        if(esPar){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
    
    /**
     * 
     * @return 
     */
    private static Integer cargarNumero() throws IOException{
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}