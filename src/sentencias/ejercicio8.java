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
public class ejercicio8 {
    // catidad de cifras
    public void ejecutar(){
        int num, numTem, cifra = 0;
    
        num = Integer.parseInt(JOptionPane.showInputDialog(("Dame un numero entre 0 y 99,999")));
        numTem = Math.abs(num);

       if(numTem == 0){
           cifra = 1;
       }else{
           while (numTem > 0){
               numTem /= 10;
               cifra++;
           }
       }
        
        JOptionPane.showConfirmDialog(null, "El numero: " +num+ " tiene " +cifra+ " cifras");
    }
}
