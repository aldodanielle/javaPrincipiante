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
public class ejercicio3 {
    // letra mayuscula o minuscula
    
    public void ejecutar(){
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingres un leytra").charAt(0);
        
        //if(Character.isUpperCase(letra))    // Usan un metodo
        if(letra > 64 && letra < 90){
            JOptionPane.showConfirmDialog(null, "La letra: " +letra+ " es MAYUSCULA");
        }else if(letra > 97 && letra < 122){
            JOptionPane.showConfirmDialog(null, "La letra: " +letra+ " es minuscula");
        }else{
            JOptionPane.showConfirmDialog(null, "No es letra");
        }
    }
    
    
}
