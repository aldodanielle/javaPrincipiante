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
public class ejercicio4 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        
        double salarioBase = 1000, comicion = 150, comicion1, carVendidos, sueldoTotal;
        double comicionCar, valorCarro =99999.99f, comicion2, comicion3;
        comicion3 = valorCarro * 0.05;
        
        System.out.println("Carros 'El Viejón'");
        System.out.print("Automoviles vendidos: ");
        carVendidos = entrada.nextInt();
       
        comicion1 = carVendidos * comicion;
        comicion2= carVendidos * comicion3;
        sueldoTotal = comicion1 + comicion2 + salarioBase;
        System.out.println("Tu salario es: " +sueldoTotal);
    }
    
}
