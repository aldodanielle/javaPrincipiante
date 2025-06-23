/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author daniellara
 */
public class operadoresAritmeticos {
    public void ejecutar(){
        Scanner entrda = new Scanner(System.in);
        
        float num1, num2;
        float sum, rest, mul, div, residuo;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame otro numero")); 
        
        sum = num1 + num2;
        rest = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        residuo = num1 % num2;
        
        JOptionPane.showMessageDialog(null, "Primer numero: " +num1+ " Segundo numero: " +num2+
                "\nLa suma es: " +sum+
                "\nLa resta es: " +rest+
                "\nLa multiplicacion es: " +mul+
                "\nLa division es: " +div+
                "\nEl residuo es: " +residuo);
    }
    
}
