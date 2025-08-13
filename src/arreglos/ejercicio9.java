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
public class ejercicio9 {
    // 10 elemtos y despzar el primero al final
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int data[] = new int [10];
        boolean esPositivo = true;
        int ultimoElemento; 
        
        System.err.println("Entrda de datos");
        do{
            for(int i= 0; i < 10; i++){
                System.out.print("Dato " +(i+1)+ ": ");
                data[i] = entrada.nextInt();
                
                if(data[i] <= 0){
                    esPositivo = false;
                    return;
                }
            }
        }while(!esPositivo);
        
        
        ultimoElemento = data[9];   // almacenamos el ultimo dato
        
        for(int i = 8; i >= 0; i--){ // avanzamos de posicion en el array
            data[i+1] = data[i];
        }
        
        data[0] = ultimoElemento; // insertamos el dato almacenado a el primer valor del arreglo
        
        System.err.println("\nResumen");
        for(int i = 0; i < 10; i++){
            System.out.println(i + " elemento " +data[i]);   
        }
    }
    
}
