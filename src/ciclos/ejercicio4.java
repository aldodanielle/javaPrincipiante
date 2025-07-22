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
public class ejercicio4 {
    // ingresa numero hasta que sea negativo
    public void ejecutar(){
        int num, contador = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero"));
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero"));
            contador++;
        }while(num > 0);
        
        JOptionPane.showConfirmDialog(null, "Los numero ingresados fueron: " +contador);
    }
}
