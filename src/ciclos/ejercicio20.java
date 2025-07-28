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
public class ejercicio20 {
    //Nomina
    public void ejecutar(){
        int nomina, sueldo;
        double sueldoMayor = Double.MIN_VALUE;
        
        nomina = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de nominas: "));
        
        for(int i = 1; i <= nomina; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Nomina " +i+ ":" ));
            
            if(sueldo > sueldoMayor){
                sueldoMayor = sueldo;
            }
        }
        
        System.out.println("Resumen");
        System.out.println("Nominas: " +nomina);
        System.out.println("El sueldo mayor es: " +sueldoMayor);
    }
    
}
