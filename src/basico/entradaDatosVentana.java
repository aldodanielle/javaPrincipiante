/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import javax.swing.JOptionPane;

/**
 *
 * @author daniellara
 */
public class entradaDatosVentana {
    public void ejecutar(){
        String name;
        int edad;
        char apellido;
        double calzado;
    
    
        name = JOptionPane.showInputDialog("Dame tu nombre: ");
        apellido = JOptionPane.showInputDialog("Dame tu apellido: ").charAt(0);
        edad = Integer.parseInt(JOptionPane.showInputDialog("Dame tu edad: "));
        calzado = Double.parseDouble(JOptionPane.showInputDialog("Que numero calzas"));
    
        JOptionPane.showMessageDialog(null, "\n Tu nombre es: " +name+ 
                "\n La primer letra de tu apellido es: " +apellido+
                "\n Tu edad es: " +edad+ " años" + 
                "\n Calzas del numero: " +calzado);
    }
    
}
