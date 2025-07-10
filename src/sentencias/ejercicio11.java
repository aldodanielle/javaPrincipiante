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
public class ejercicio11 {
    // calculadora
    public void ejecutar(){
        char opcion;
        float num1, num2, sum, res, mult, div;
        
        opcion = JOptionPane.showInputDialog("Calculadora \n"
                + "S. suma \n"
                + "R. resta \n"
                + "M. Multiplicacion \n"
                + "D. Divicion \n"
                + "Dame una letra de la operacion que desees: ").toUpperCase().charAt(0);
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer valor: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo valor: "));
        
        switch(opcion){
            case 'S':
                sum = num1 + num2;
                JOptionPane.showConfirmDialog(null, "La suma de " +num1+ " y " +num2+ " es igual a: " +sum);
                break;
            case 'R':
                res = num1 - num2;
                JOptionPane.showConfirmDialog(null, "La resta de " +num1+ " y " +num2+ " es igual a: " +res);
                break;
            case 'M':
                mult = num1 * num2;
                JOptionPane.showConfirmDialog(null, "La multiplicacion de " +num1+ " y " +num2+ " es igual a: " +mult);
                break;
            case 'D':
                div = num1 / num2;
                JOptionPane.showConfirmDialog(null, "La division de " +num1+ " y " +num2+ " es igual a: " +div);
                break;
                
            default:
                JOptionPane.showConfirmDialog(null, "opcion incorrecta ");
                break;
        }
    }
    
}
