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
public class ejercicio9 {
    public void ejecutar(){
        // comprobacion de fecha
        int dia, mes, ano;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Dame el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Dame el mes: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Dame el año: "));
        
        if(dia > 0 && dia <= 30){
            if(mes > 0 && mes <= 12){
                if(ano != 0){
                    JOptionPane.showConfirmDialog(null, "La fecha es correcta: " +dia+ "-"+mes+"-"+ano+" ✅");
                }else{
                    JOptionPane.showConfirmDialog(null, "El año no puede ser: "+ano+ " ❌");
                }
            }else{
                JOptionPane.showConfirmDialog(null, "El mes no puede ser: "+mes+ " ❌");
            }
        }else{
        JOptionPane.showConfirmDialog(null, "El dia no puede ser: " +dia+ " ❌");
        }
    }
    
}
