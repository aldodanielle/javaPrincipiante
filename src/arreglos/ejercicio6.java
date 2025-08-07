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
public class ejercicio6 {
    // mezcla de 2 areglos de 3 en 3
    public void ejecutar(){
        
        Scanner entrada = new Scanner(System.in);
        
        int datosA[] = new int [12];
        int datosB[] = new int [12];
        int res[] = new int [24];
        
        System.err.println("Datos de A");
        for(int i = 0; i < 12; i++){
            System.out.print("Dato " +(i+1)+ ": ");
            datosA[i] = entrada.nextInt();
        }
        
        System.err.println("Datos B");
        for(int i = 0; i < 12; i++){
            System.out.print("Dato " +(i+1)+ ": ");
            datosB[i] = entrada.nextInt();
        }
        
        System.err.println("Reseultado");
        
        int c = 0;
        for(int i = 0; i < 12; i+= 3){
            
            for(int j = 0; j < 3 && (i+j) < 12; j++){
                res[c] = datosA[i +j];
                c++;
            }
            
            for(int j = 0; j < 3 && (i+j) < 12; j++){
                res[c] = datosB[i+j];
                c++;
            }
        }
        
        for(int i = 0; i < c; i++){
            System.out.print(res[i]+ " ");
        }
        
        System.out.println("");
    }
    
}
