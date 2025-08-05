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
public class ejercicio4 {
    // pide 10 valores y lo imprime el primero, el ultimo, el segundo, el penultimo, etc..
    public void ejecutar(){
        
        Scanner entrada = new Scanner(System.in);
        int data[] = new int [10];
        int size = data.length;
        
        System.err.println("Entrada de datos");
        for(int i = 0; i < 10; i++){
            System.out.print("Dame el dato " +(i+1)+ ": ");
            data[i] = entrada.nextInt();
        }
        
        
        System.err.println("\nDatos impresos comon se solicitan");
        for(int i = 0; i < (size +1) / 2; i++){
            System.out.print(data[i] + " ");
            if(i != size -1 -i){
                System.out.print(data[size -1 -i] +" ");
            }
        }
        
        System.out.println("");
        
        
    }
    
}
