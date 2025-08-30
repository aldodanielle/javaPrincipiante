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
public class ejercicio12 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int nuevoDato;
        
        System.out.println("Entrada datos");
        for(int i = 0; i < 10; i++){
            System.out.print("Dato " +(i+1)+ ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("Dame la una posicion");
        nuevoDato = entrada.nextInt();
        
        
        //salida
        System.out.println("\nSalida");
        for(int i = 0; i < 10; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
    
}
