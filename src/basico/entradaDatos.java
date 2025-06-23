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
public class entradaDatos {
    
    public void ejecutar(){
    
        Scanner entrada = new Scanner(System.in);
        
        String name;
        char letra;
        int anoNacimeinto, edad;
        float calzado;
        
        
        System.out.print("Dame tu nombre: ");
        //name = entrada.next();      // Solo aguarda hasta que encuentra una espacio en blanco
        name = entrada.nextLine();  // Toda la cadena
        
        //System.out.println("Tu nombre es: " +name);
        
        
        System.out.print("Dame tu apellido: ");
        letra = entrada.next().charAt(0);   // Para que nos dijite el primer caracter ingresado pero con el numero 0 puese cualquier letra de una frase
        
        //System.out.println("Letra es: "+letra);
        
        System.out.print("Dame tu año de nacimiento: ");
        anoNacimeinto = entrada.nextInt();
        
        edad= 2025 - anoNacimeinto;
        
        //System.out.println("Tu edad es: " +edad+ " años");
        
        
        System.out.print("Que numero calzas? ");
        calzado = entrada.nextFloat();
        
        //System.out.println("Tu calzas de numero: " +calzado);
        
        
        System.out.println("\n Tu nombre es: " +name+  
                "\n La primera letra de tu apellido es: " +letra+ 
                "\n tu edad es: " +edad+ " años " +
                "\n calzas del numero: " +calzado);
    }
    
}
