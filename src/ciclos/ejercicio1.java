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
public class ejercicio1 {
    // cuadrado de numero hasta que este sea negativo
    public void ejecutar(){
        int num, resul;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(" Cuadro de un numero: "
                + "\n Dame un numero: "));
        while(num >= 0){
            resul = (int)Math.pow(num, 2);
            JOptionPane.showMessageDialog(null, "El cuadrado de " +num+ " es " +resul);
            
            num = Integer.parseInt(JOptionPane.showInputDialog(" Dame otro numero: "));
        }
    }
    
}
