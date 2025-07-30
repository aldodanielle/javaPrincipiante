/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Arrays;

/**
 *
 * @author daniellara
 */
public class conceptos {
    // Definicion y conceptos
    public void ejecutar(){
        int [] num = new int[4]; // -> asi se declara un arreglo
        //tipo de dato [] nombre del arreglo = new tipo de dato [tamaño del arreglo]
        
        
        // Llenado del arreglo de forma manual 
        num[0] = 0;
        num[1] = 3;
        num[2] = 1;
        num[3] = 14;
        
        System.out.println(num[3]);     // se imprime el arreglo en el la posicion 3
        
        System.out.println(Arrays.toString(num));   // Se imprme usando toString
        
        
        
        // otra forma de llevar un arreglo
        System.out.println("valores");
        int [] valores = {03, 14};
        for(int i = 0; i < 2; i++){     // con un ciclo 
            System.err.println(valores[i]);
        }
    }
    
}
