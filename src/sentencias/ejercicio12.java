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
public class ejercicio12 {
    // verificar nota
    public void ejecutar(){
        int nota;
        
        nota = Integer.parseInt(JOptionPane.showInputDialog("Dame tu nota: "));
        
        if(nota == 10){
            JOptionPane.showConfirmDialog(null, nota+ " Sobresaliente 😎");
        }else if(nota == 9){
            JOptionPane.showConfirmDialog(null, nota+ " Notable 🧐");
        }else if(nota == 8){
            JOptionPane.showConfirmDialog(null, nota+ " Bien 🙂");
        }else if(nota == 7){
            JOptionPane.showConfirmDialog(null, nota+ " Suficiente 🫠");
        }else if(nota >= 0 && nota <= 6){
            JOptionPane.showConfirmDialog(null, nota+ " Insuficiente 🥲");
        }else{
            JOptionPane.showConfirmDialog(null, " SIN NOTA ");
        }
        
    }
    
}
