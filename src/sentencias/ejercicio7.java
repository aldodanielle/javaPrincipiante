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
public class ejercicio7 {
    public void ejecutar(){
        // ordenar del mayor a menor
        int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog(("Dame el primer numero: ")));
        b = Integer.parseInt(JOptionPane.showInputDialog(("Dame el segundo numero: ")));
        c = Integer.parseInt(JOptionPane.showInputDialog(("Dame el tercer numero: ")));
        
        if(a > b && b > c){
            JOptionPane.showConfirmDialog(null, "Orden: " +a+ " - " +b+ " - " +c);
        }else if(a > c && c > b){
            JOptionPane.showConfirmDialog(null, "Orden: " +a+ " - " +c+ " - " +b);
        }else if(b > a && b > c){
            JOptionPane.showConfirmDialog(null, "Orden: " +b+ " - " +a+ " - " +c);
        }else if(b > c && c > a){
            JOptionPane.showConfirmDialog(null, "Orden: " +b+ " - " +c+ " - " +a);
        }else if(c > a && c > b){
            JOptionPane.showConfirmDialog(null, "Orden: " +c+ " - " +a+ " - " +b);
        }else{
            JOptionPane.showConfirmDialog(null, "Orden: " +c+ " - " +b+ " - " +a);
        }
    }
    
}
