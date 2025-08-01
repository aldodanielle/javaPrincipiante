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
public class ejercicio2 {
    // mostra 5 numero a la invesa
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        
        int num[] = new int [5];
        
        System.err.println("Entrada de datos");
        for(int i = 0; i < 5; i++){
            System.out.print((i+1)+". Dame el numero: ");
            num[i] = entrada.nextInt();
        }
        
        System.err.println("Numero ingresados");
        for(int i = num.length -1; i >= 0; i--){
            System.out.print(num[i] + ", ");
        }
        System.out.println(" ");
    }
    
}
