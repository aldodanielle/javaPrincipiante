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
public class ejercicio3 {
    // catidad de dolares 
    
    public void ejecutar(){
        Scanner entrada= new Scanner(System.in);
        int dolares, guillerno, luis, juan;
        
        
        System.out.print("Dolares: ");
        dolares = entrada.nextInt();
        guillerno = dolares;
        luis = guillerno / 2;
        juan = (guillerno + luis) / 2;
        System.out.println("Guillermo tiene: $" +guillerno+ " dolares");
        System.out.println("Luis tiene: $" +luis+ " dolares");
        System.out.println("Juan tiene: $" +juan+ " dolares");


    }
    
}
