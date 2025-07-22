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
public class ejercicio5 {
    //numero aleatraio hasta adivinar
    public void ejecutar(){
        
        int num, aleatorio, contador = 0;
        aleatorio = (int)(Math.random()*100);
       
        
        do {    
            num = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero aletorio"
                + "\nDame un numero: "));
            
            if (aleatorio > num){
                JOptionPane.showConfirmDialog(null, "Dame un numero mayor al ingresado");
            }else{
                JOptionPane.showConfirmDialog(null, "Dame un numero menor al ingresado");
            }
            
            contador++;    
        } while (num != aleatorio);
        
        
        JOptionPane.showConfirmDialog(null, "🎉🎉 Felicidades 🥳"
                + "\nNumero ganador: " +aleatorio 
                + "\nIntentos: " +contador);
    }
}
