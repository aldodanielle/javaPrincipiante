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
public class ejercicio4 {
    public void ejecutar(){
        // descueno del 20% si compra en mayor a 300
        
        int descuento;
        
        descuento = Integer.parseInt(JOptionPane.showInputDialog("Catidad a pagar: "));
        
        if(descuento >= 300){
            descuento *= 0.80;
            JOptionPane.showConfirmDialog(null, "El total a pagar es: " +descuento);
        }else{
            JOptionPane.showConfirmDialog(null, "El total a pagar es: " +descuento);
        }
    }
    
}
