/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author daniellara
 */
public class ejercicio14 {
    // suledo mayor a 1,000
    public void ejecutar(){
        int sueldo, sumSueldo = 0, sueldoMayor = 0, sueldoMenor = 0, numSuel = 1;
        
        for(int i = 1; i <= 10; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("El sueldo " +numSuel+ " es de: "));
            numSuel++;
            
            if(sueldo >= 1000){
                sueldoMayor++;
            }else{
                sueldoMenor++;
            }
            
            sumSueldo += sueldo;
        }
        
        System.out.println("La suma de sueldo es: " +sumSueldo);
        System.out.println("Tenemos: " +sueldoMayor+ " mayores");
        System.out.println("Tenemos: " +sueldoMenor+ " menores");
        
    }
    
}
