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
public class ejercicio5 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        float participacion, parcial1, parcial2, examenFinal, notafinal;
        
        System.out.println("Calificacion final");
        System.out.print("Dame tu participacion: ");
        participacion = entrada.nextFloat();
        System.out.print("Calificacion del 1° parcial: ");
        parcial1 = entrada.nextFloat();
        System.out.print("Calificacion del 2° parcial: ");
        parcial2 = entrada.nextFloat();
        System.out.print("Examen final: ");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.10;
        parcial1 *= 0.25;
        parcial2 *= 0.25;
        examenFinal *= 40;
        
        notafinal = (participacion + parcial1 + parcial2 + examenFinal) / 4;
        System.out.println("Tu calificacion es: " +notafinal);
    }
    
}
