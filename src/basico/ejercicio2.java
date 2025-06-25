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
public class ejercicio2 {
    public void ejecutar(){
        // Salario en base a horas trabajadas

        Scanner entrada = new Scanner(System.in);
        Float pagoHora = 8.7f, horas, sueldo;

        System.out.println("El pago por hora es: $" +pagoHora+ " dolares");
        System.out.print("Ingresa tus horas trabajas esta semana: ");
        horas = entrada.nextFloat();
        sueldo = horas * pagoHora;
        System.out.println("\nTu sueldo es: $" +sueldo+ " dolares");
    }
}
