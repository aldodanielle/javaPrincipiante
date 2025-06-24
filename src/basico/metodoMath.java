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
public class metodoMath {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        
        double num;
        
        System.out.println(" Raiz ");
        System.out.print("Dame un numero : ");
        num = entrada.nextDouble();
        double raiz = Math.sqrt(num);
         
        System.out.println("La raiz de: "  + num + " es: " + raiz);
        
        
        double base, expo;
        System.out.println("\nExponente");
        System.out.print("Dame la base: ");
        base = entrada.nextDouble();
        System.out.print("Dame el exponente: ");
        expo = entrada.nextDouble();
        
        double result = Math.pow(base, expo);
        System.out.println("La elevacion del " + base + " con esponente: " + expo + " es igual a: " +result);
        
        
        System.out.println("\nRedondeo");
        double calificacion;
        
        System.out.print("Tu calificaion es: ");
        calificacion = entrada.nextDouble();
        long redondeo = Math.round(calificacion);
        System.out.println("Tu calificaion redondeada es: " +redondeo);
        
        
        System.out.println("\nRandom");
        double aleatorio = Math.random();
        
        System.out.println("El numero aleatorioes: "+aleatorio);
    }
    
}
