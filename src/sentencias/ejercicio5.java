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
public class ejercicio5 {
    
    //salario obrero
    public void ejecutar(){
        int salario, pagoHora, horaExtra, horasTrabajada;
        
        horasTrabajada = Integer.parseInt(JOptionPane.showInputDialog("Dame el total de horas trabajadas"));
        
        if(horasTrabajada >= 41){
            horasTrabajada -= 40;
            
            horaExtra = horasTrabajada * 20;
            pagoHora = 40 * 16;
            
            salario = horaExtra + pagoHora;
        }else{
            salario = horasTrabajada * 16;
        }
        
        JOptionPane.showConfirmDialog(null, "El total a pagar es: $" +salario+ " dolares");
    }
    
}
