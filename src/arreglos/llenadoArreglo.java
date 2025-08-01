/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author daniellara
 */
public class llenadoArreglo {
    // llenado de datos por medio del usuario
    public void ejecutar(){
        
        Scanner entrada = new Scanner(System.in);
        int elementos;
        
        elementos = Integer.parseInt(JOptionPane.showInputDialog("Dame el numero de elementos del arreglo: "));
        
        char [] iniciales = new char [elementos];
        
        System.out.println("Dame los elementos de arreglo ");
        for(int i = 0; i < elementos; i++){
            //System.out.print((i+1) +". Dame un caracter: ");
            //iniciales[i] = entrada.next().charAt(0);
            
            iniciales[i] = JOptionPane.showInputDialog((i+1) + ". Dame un caracter: ").charAt(0);
        }
        
        //String cadenaIniciales = new String(iniciales);
        //JOptionPane.showMessageDialog(null, "iniciales " +cadenaIniciales);
        JOptionPane.showMessageDialog(null, "iniciales " + Arrays.toString(iniciales));

        
        System.err.println("Los datos del arreglo son");
        System.out.println(Arrays.toString(iniciales));
    }
    
}
