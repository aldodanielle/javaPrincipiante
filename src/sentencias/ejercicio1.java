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
public class ejercicio1 {
    // determinar si un numero Entero es multiplo de 10
    
    public void ejecutar(){
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));
        
        
        if(num%10 == 0){
            JOptionPane.showConfirmDialog(null, "EL numero: " +num+ " SI es multiplo 10");
        }else{
            JOptionPane.showConfirmDialog(null, "EL numero: " +num+ " NO es multiplo");
        }
    }
    
}
