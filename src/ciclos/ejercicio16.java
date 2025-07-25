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
public class ejercicio16 {
    //tabla de multiplicar
    public void ejecutar(){
        int tabla, resul;
        
        tabla = Integer.parseInt(JOptionPane.showInputDialog("Dame la tabla a mostar: "));
        
        for(int i = 1; i <= 10; i++){
            resul = i * tabla;
            System.out.println(i+ " * " +tabla+ " = " +resul);
        }
    }
    
}
