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
public class ejercicio6 {
    // numeros impartes
    public void  ejecutar(){
        int num1, num2;
    
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero 2: "));
        
        boolean test1 = num1 % 2 !=0;
        boolean test2 = num2 % 2 !=0;

        if(test1 && test2){
            JOptionPane.showConfirmDialog(null, "Los numeros: " +num1+ ", " +num2+ " son impar");
        } else if(!test1 && !test2){
            JOptionPane.showConfirmDialog(null, "Los numeros: " +num1+ ", " +num2+ " son par");
        } else {
            JOptionPane.showConfirmDialog(null, "Algun numero: " +num1+ ", " +num2+ " son impar");
        }
        
    }
    
}
