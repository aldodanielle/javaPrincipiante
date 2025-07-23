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
public class ejercicio12 {
    // factorial de N
    public void ejecutar(){
        long num, fact = 1;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(" ..:: Factorial ::.."));
        
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        
        JOptionPane.showConfirmDialog(null, "El factorial de " +num+ " es: " +fact);
    }
    
}
