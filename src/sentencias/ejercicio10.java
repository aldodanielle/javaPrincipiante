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
public class ejercicio10 {
    // verificacion para todos los meses
    public void ejecutar(){
        int dia, mes, ano;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Dame el dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Dame el mes: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Dame el año: "));
        
        if(dia > 0 && dia <= 31){
            if(dia == 28){
                if(mes == 2){
                    if(ano != 0){
                        JOptionPane.showConfirmDialog(null, "La fecha es correcta: " +dia+ "-"+mes+"-"+ano+" ✅");
                    }else{
                        JOptionPane.showConfirmDialog(null, "El año es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                    }
                }else{
                    JOptionPane.showConfirmDialog(null, "El mes es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                }
            }else if(dia == 30){
                if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if(ano != 0){
                        JOptionPane.showConfirmDialog(null, "La fecha es correcta: " +dia+ "-"+mes+"-"+ano+" ✅");
                    }else{
                        JOptionPane.showConfirmDialog(null, "El año es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                    }
                }else{
                    JOptionPane.showConfirmDialog(null, "El mes es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                }
            }else if(dia == 31){
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if(ano != 0){
                        JOptionPane.showConfirmDialog(null, "La fecha es correcta: " +dia+ "-"+mes+"-"+ano+" ✅");
                    }else{
                        JOptionPane.showConfirmDialog(null, "El año es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                    }
                }else{
                    JOptionPane.showConfirmDialog(null, "El mes es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                }
            }else if(mes > 0 && mes <=12){
                if(ano != 0){
                    JOptionPane.showConfirmDialog(null, "La fecha es correcta: " +dia+ "-"+mes+"-"+ano+" ✅");
                }else{
                    JOptionPane.showConfirmDialog(null, "El fecha es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
                }
            }else
                JOptionPane.showConfirmDialog(null, "El fecha es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
        }else {
            JOptionPane.showConfirmDialog(null, "El fecha es incorrecta: " +dia+ "-"+mes+"-"+ano+" ❌");
        }
    }
    
}
