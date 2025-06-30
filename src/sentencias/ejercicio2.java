/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentencias;

import javax.swing.JOptionPane;

/**
 *
 * @author daniellara
 */
public class ejercicio2 {
    // numero mayor
    public void ejecutar(){
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero 2: "));
        
        
        if(num1 > num2){
            JOptionPane.showConfirmDialog(null, "El numero: " +num1+ " mayor que: " +num2);
        }else if(num2 > num1){
            JOptionPane.showConfirmDialog(null, "El numero: " +num2+ " mayor que: " +num1);
        }else{
            JOptionPane.showConfirmDialog(null, "El numero: " +num1+ " y el numero " +num2+ " son iguales");
        }
    }
    
}
