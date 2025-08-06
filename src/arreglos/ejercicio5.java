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
public class ejercicio5 {
    // mezcla de 2 arreglos
    public void ejecutar(){
        
        Scanner entrada = new Scanner(System.in);
        
        int data1[] = new int[5];
        char data2[] = new char[5];
        int resul[];
        resul = new int [10];
        
        System.err.println("Entrada Data 1");
        for(int i = 0; i < 5; i++){
            System.out.print("Dame el valor " +(i+1)+ ": ");
            data1[i] = entrada.nextInt();
        }
        
        System.err.println("\nEntrada Data 2");
        for(int i = 0; i < 5; i++){
            System.out.print("Dame El valor " +(i+1)+ ": ");
            data2[i] = entrada.next().charAt(0);
        }
        
        //Mezcla de los dos arreglos comtrolados por el iterador "controlador"
        int controlador = 0;
        for(int i= 0; i < 5; i++){
            resul[controlador] = data1[i];
            controlador++;
            resul[controlador] = data2[i];
            controlador++;
        }
        
        
        System.err.println("\nResultado");
        /*for(int i: resul){
            System.out.print(resul[i] + " ");
        }*/
        for(int i = 0; i < 10; i++){
            System.out.print(resul[i] + " ");
        }
        
        System.out.println(" ");
    }
    
}
