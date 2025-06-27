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
public class sentenciaSwitch {
    public void ejecutar(){
        
        int opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(" .: Menu :." +
                "\n1. Pizza - $10" +
                "\n2. Hamburguesa - $8" +
                "\n3. Ensalada - $6" +
                "\n4. Pasta - $12" +
                "\n5. Salir" +
                "\nIngrese una opcion: "));
        
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null, "Usted eligio Pizza  🍕");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Usted eligio Hamburguesa 🍔");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted eligio Ensalada 🥗");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Usted eligio Pasta 🍝");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Usted esta saliendo del Menu ➡️🚶‍");
                break;
            default:
                JOptionPane.showMessageDialog(null, "NO se invesil ere numero no existe 🤬");
                break;
        }
        
    }
    
}
