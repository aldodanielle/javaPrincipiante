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
public class ejercicio14 {
    // medias de masa
    public void ejecutar(){
        float kilos, mili, gram, kil, tone;
        int option;
        
        kilos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos Kilos tienes? "));
        option = Integer.parseInt(JOptionPane.showInputDialog(" .: Menu :."
                + "\n1. Miligramo"
                + "\n2. Gramo"
                + "\n3. Kilos"
                + "\n4. Toneldas"
                + "\nA que unidad de masa desea conocer su equivalencia: "));
        switch(option){
            case 1:
                mili = kilos * 1000000;
                JOptionPane.showConfirmDialog(null, " Miligramos "
                        + "\n Tus "+kilos+"kg equivalena a: " +mili+ " miligramos");
                break;
            case 2:
                gram = kilos * 1000;
                JOptionPane.showConfirmDialog(null, " Gramos "
                        + "\n Tus "+kilos+"kg equivalena a: " +gram+ " gramos");
                break;
            case 3:
                JOptionPane.showConfirmDialog(null, " Kiloss "
                        + "\n Tus "+kilos+"kg equivalena a: " +kilos+ " kilos");
                break;
            case 4:
                tone = kilos/1000;
                JOptionPane.showConfirmDialog(null, " Miligramos "
                        + "\n Tus "+kilos+"kg equivalena a: " +tone+ " toneladas");
                break;
            default:
                JOptionPane.showConfirmDialog(null, "error de opcion");
                break;
        }
    }
    
}
