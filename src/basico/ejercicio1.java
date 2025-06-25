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
public class ejercicio1 {
    
    // Prodio de calificaciones 
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        
        float cali1, cali2, cali3, cali4, resul;
        String name;
        
        System.out.println("Calificaciones");
        System.out.print("Dame tu nombre: ");
        name = entrada.nextLine();
        
        System.out.println("Bienvenido " +name);
        /*System.out.print("Dame la calificaione el 1° parcial: ");
        cali1 = entrada.nextFloat();
        System.out.print("Dame la calificaione el 2° parcial: ");
        cali2 = entrada.nextFloat();
        System.out.print("Dame la calificaione el 3° parcial: ");
        cali3 = entrada.nextFloat();
        System.out.print("Dame la calificaione el 4° parcial: ");
        cali4 = entrada.nextFloat();
        
        resul = (cali1 + cali2 + cali3 + cali4) / 4;
        
        System.out.println("Tu calificacion final " +name+ " es: " +resul);*/
        
        
        // optimizacion
        int parcial = 0;
        float nota, promedio, sumaNota = 0;
        
        for(parcial = 1; parcial < 5; parcial++){
            System.out.print("Dame la calificaion del " +parcial+ "° parcial: ");
            nota = entrada.nextFloat();
            sumaNota += nota;
        }
        promedio = sumaNota/4;
        System.out.println("Tu calificacion final " +name+ " es: " +promedio);
        
    }
    
}
