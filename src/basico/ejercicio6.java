/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.util.Scanner;

/**
 *
 * @author daniellara
 */
public class ejercicio6 {
    public void ejecutar(){
        //suma del cuadrado de un numero
        //(a+b)2 = a2 + b2 2ab
        Scanner entrada = new Scanner(System.in);
        double a, b, r0, r1, r2, r3, r4, r5;
        
        System.out.println("Cuadrado de una suma");
        System.out.println("(a+b)2 = a2 + b2 + 2ab");
        System.out.print("Dame el valor de 'a': ");
        a = entrada.nextFloat();
        System.out.print("Dame el valor de 'b': ");
        b = entrada.nextFloat();
        
        r0 = a + b;
        r1 = Math.pow(r0, 2);
        r2 = Math.pow(a, 2);
        r3 = Math.pow(b, 2);
        r4 = 2 * a * b;
        r5 = r2 + r3 + r4;
        System.out.println("El resultado es: " + r1 + " = " + r5);
        

    }
    
}
