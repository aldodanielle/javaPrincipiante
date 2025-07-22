/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author daniellara
 */
public class cicloFor {
    // ciclo For -> repite una accion tantas veces como se pida
    // de 2 en dos
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        int cuenta;
        
        System.out.println(" Cuenta de 2 en 2");
        System.out.print("Dame hastas que numero se cuenta: ");
        cuenta = entrada.nextInt();
        
        for (int i = 2; i <=cuenta; i+=2){
            System.out.println(i);
        }
    }
    
}
