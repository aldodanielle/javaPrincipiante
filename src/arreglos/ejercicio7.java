/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author daniellara
 */
public class ejercicio7 {
    // solicitud de 10 numero y si estan son Decreciente, Creciente, Revueltos o Iguales
    public void ejecutar(){
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int [10];
        boolean decreciente = false;
        boolean creciente = false;
        
        System.err.println("Entrada de datos");
        for(int i = 0; i < 10; i++){
            System.out.print("Dame el valor " +(i+1)+ ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        for(int i = 0; i < 9; i++){
            if(arreglo[1] < arreglo[i+1]){
                creciente = true;
            }
            if(arreglo[i] > arreglo[i+1]){
                decreciente = true;
            }
        }
        
        System.err.println("Resultado");
        if(creciente == true && decreciente == false){
            System.out.println("El arreglo es Creciente");
        }else if(creciente == false && decreciente == true){
            System.out.println("El arreglos es Decreciemte");
        }else if(creciente == true && decreciente == true){
            System.out.println("El arreglo esta en Desorden");
        }else{
            System.out.println("Los elementos del arreglo son iguales");
        }
    }
    
}
