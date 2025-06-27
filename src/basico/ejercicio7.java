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
public class ejercicio7 {
    public void ejecutar(){
        // numero de semanas por horas dadas
        Scanner entrada = new Scanner(System.in);
        int horas,semana, dias, hora;
        
        System.out.print("Dame unas horas: ");
        horas = entrada.nextInt();
        semana = horas / 168;
        dias = horas%168 / 24;
        hora = horas%24;
        System.out.println("Esto equivalea a: \n" 
                +semana+ " semanas \n" 
                +dias+ " dias \n" 
                +hora+ " horas \n");
    }
    
}
