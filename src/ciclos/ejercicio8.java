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
public class ejercicio8 {
    //imprime desde 1 hasta N
    public void ejecutar(){
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero final"));
        
        if(num < 0){
            JOptionPane.showConfirmDialog(null, "Error");
        }else{
            for(int i = 1; i <= num; i++){
                //JOptionPane.showConfirmDialog(null, i);
                System.out.println(i);
            }
        }
    }
    
}
