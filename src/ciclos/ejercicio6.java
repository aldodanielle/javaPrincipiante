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
public class ejercicio6 {
    // suma de num
    public void ejecutar(){
        int sum = 0, num1;
        
        do{
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
            sum += num1;
        }while(num1 != 0);
        
        JOptionPane.showConfirmDialog(null, "La suma de los numero es: " +sum);
    }
    
}
