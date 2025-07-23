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
public class ejercicio11 {
    // producto de los 10 primeros numero
    public void ejecutar(){
        long producto = 1;
        
        for(int i = 1; i <= 20; i+=2){
            producto *= i;
        }
        
        JOptionPane.showConfirmDialog(null, "El producto es: " +producto);
    }
    
}
