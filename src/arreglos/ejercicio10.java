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
public class ejercicio10 {
    // 10 numeros y se recorren N catidades 
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        
        int arreglo[] = new int[10];
        int desplazamiento[] = new int[10];
        int recorrido;
        int data1;
        
        System.err.println("Entrada Datos");
        for(int i = 0; i < 10; i++){
            System.out.print("Dato " +(i+1)+ ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.err.println("Recorrido");
        System.out.print("Dame el numero de recorridos");
        recorrido = entrada.nextInt();
        
        // Arreglo desplazado
        for(int i = 0; i < 10; i++){
            desplazamiento[(i + recorrido) % 10] = arreglo[i];
        }
        
        System.err.println("Arreglo Original");
        for(int i: arreglo){
            System.out.print( i + " ");
        }
        System.out.println("");
        
        System.err.println("Resultado");
        for(int i : desplazamiento){
            System.out.print( i + " ");
        }
        
        System.out.println(" \n");
    }
    
}
