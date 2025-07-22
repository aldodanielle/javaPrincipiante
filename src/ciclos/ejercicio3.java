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
public class ejercicio3 {
    
    // numeros pares e impar
    public void ejecutar(){
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
        
        while(num != 0){
            if(num %2 == 0){
                JOptionPane.showConfirmDialog(null, "El numero: " +num+ " es par");
            }else{
                JOptionPane.showConfirmDialog(null, "El numero: " +num+ " es impar");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero: "));
        }
    }
    
}
