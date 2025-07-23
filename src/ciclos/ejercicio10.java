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
public class ejercicio10 {
    // suma de 10 numero
    public void ejecutar(){
        int sum = 0, num;
        
        for(int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero "));
            sum += num;
        }
        JOptionPane.showConfirmDialog(null, "La suma es: " +sum);
    }
    
}
