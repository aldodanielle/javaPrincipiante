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
public class ejercicio2 {
    // veri si un numero es positivo o negativo y si es 0 sale del programa
    
    public void ejecutar(){
        int num;
    
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero:"));
        
        while (num != 0){
            if(num > 0){
                JOptionPane.showMessageDialog(null, "El " +num+ " es positivo");
            }else if(num < 0){
                JOptionPane.showMessageDialog(null, "El " +num+ " es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero:"));
        }
    }
    
}
