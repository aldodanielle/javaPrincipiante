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
public class ejercicio1 {
    // entrada 5 numero y mostarlo  como entraron 
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        float num[]= new float[5];
        
        System.err.println("Obteniendo datos del arreglo");
        for(int i = 0; i < 5; i++){
            System.out.print((i+1)+". Dame el numero: ");
            num[i] = entrada.nextFloat();
        }
        
        System.err.println("Los Datos del arreglo son");
        for(float i : num){
            System.out.println(i);
        }
    }
    
}
