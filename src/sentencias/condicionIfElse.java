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
public class condicionIfElse {
    public void ejecutar(){
        int num;
        
        System.out.println("Condicion If-else");
        double aleatorio = Math.random();
        aleatorio *=100;
        double redondeo = Math.round(aleatorio);
        num = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: " +redondeo));
        
        // != diferente
        // > mayor que
        // < menor que
        if (num == redondeo){
            JOptionPane.showMessageDialog(null, "🎉🎉 Felicidades arestate el numero "  +redondeo);
        }else{
            JOptionPane.showMessageDialog(null, "El numero es diferente");
        }
    }
    
}
