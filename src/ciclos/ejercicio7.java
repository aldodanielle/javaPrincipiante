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
public class ejercicio7 {
    // pomedio de numero hasta que se introduce un NEGATIVO
    public void ejecutar(){
        int num, contador = 0, sum = 0;
        float promedio;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
        
        while(num >= 0){
            sum += num;
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero: "));
        }
        
        if(contador == 0){
            JOptionPane.showConfirmDialog(null, "Error");
        }else{
            promedio = (float)sum / contador;
            JOptionPane.showConfirmDialog(null, "Pomedio es: " +promedio);
        }
        
    }
    
}
