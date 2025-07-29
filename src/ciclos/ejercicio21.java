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
public class ejercicio21 {
    // No negativo
    public void ejecutar(){
        int num;
        boolean esNegativo = false;
        
        for(int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero: " +i));
            
            if(num < 0){
                esNegativo = true;
            }
        }
        
        if(esNegativo == true){
            System.out.println("Existen numeros negativos ");
        }else{
            System.err.println("NO hay negativos");
        }
    }
    
}
