/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.awt.datatransfer.FlavorListener;
import java.util.Scanner;

/**
 *
 * @author daniellara
 */
public class ejercicio11 {
    // incremento de arreglo 
    public void ejecutar (){
        Scanner entrada = new Scanner(System.in);
        int data[] = new int[10];
        boolean orden = true;
        int newNum;
        
        
        System.out.println("Entrada Datos");
        System.out.println("Recuerda que son numero crecientes");
        do{
            for(int i = 0; i < 5; i++){
                System.out.print("Datos " + (i+1) + ": ");
                data[i] = entrada.nextInt();
            }
            
            
            for(int i = 0; i < 4; i++){
                if(data[i] < data[i+1]){    // orden correcto 1-2-3-4...
                    orden = true;
                }
                if(data[i] > data[i+1]){    // en desorden 1-3-4-2
                    orden = false;
                    break;
                }
            }
            
            if(orden == false){
                System.err.println("El orden es incorrecto, vuleve a intentar");
            }
        }while(orden == false);
        
        System.out.print("Dame el numero a insertar: ");
        newNum = entrada.nextInt();
    }
    
}
