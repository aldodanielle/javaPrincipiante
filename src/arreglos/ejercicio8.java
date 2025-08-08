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
public class ejercicio8 {
    // arreglo de 10 elementos para inserta 9 y 1 en una posicion del arreglo
    public void ejecutar(){
        
        Scanner entrada = new Scanner(System.in);
        int arreglo [] = new int [10];
        int posicion;
        int dato;
        
        System.err.println("Entrada de datos");
        for(int i = 0; i < 9; i++){
            System.out.print("Dame el dato " +(i+1)+ ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.err.println("\nDato extra");
        System.out.print("Dame la posicion: ");
        posicion = entrada.nextInt();
        System.out.print("Dame el dato: ");
        dato = entrada.nextInt();
        
        
        // Vailidacion
        if(posicion < 0 || posicion > 9){
            System.out.println("Posicion Incorrecta");
            return;
        }
        
        
        // Desplazamiento a la derecha
        for(int i = 9; i > posicion; i--){
            arreglo[i] = arreglo[i - 1];
        }
        
        // inserpcion del dato
        arreglo[posicion] = dato;
            
        
        // se imprimen los resultados
        System.err.println("Resultado");
        for(int i = 0; i < 10; i++){
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("\n");
    }
}
