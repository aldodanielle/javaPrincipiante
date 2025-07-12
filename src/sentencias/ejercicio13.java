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
public class ejercicio13 {
    // simulacion de cajero
    public void ejecutar(){
        int saldoInicial = 1000, accion, ingresar, retiro;
        
        accion = Integer.parseInt(JOptionPane.showInputDialog("Tu saldo inicla es: " +saldoInicial+
                "\n1. Ingresar Dinero "
                        + "\n2. Retirar Dinero"
                        + "\n3. Salir"
                        + "\nQue desea hacer: "));
        
        switch(accion){
            case 1: 
                ingresar = Integer.parseInt(JOptionPane.showInputDialog(null, "Saldo $" +saldoInicial
                        +"\nDame la catidad a ingresar: "));
                saldoInicial += ingresar;
                JOptionPane.showConfirmDialog(null, "Nuevo saldo: $" +saldoInicial);
                break;
            case 2:
                retiro = Integer.parseInt(JOptionPane.showInputDialog(null, "Saldo $" +saldoInicial
                + "\nDame la catidad a retirar: "));
                if(retiro <= 1000){
                    saldoInicial -= retiro; 
                    JOptionPane.showConfirmDialog(null, "Nuevo saldo: $" +saldoInicial);
                }else{
                    JOptionPane.showConfirmDialog(null, "No puedes retirar mas de $" +saldoInicial);
                }
                break;
            case 3:
                JOptionPane.showConfirmDialog(null, "Saliendo...");
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Opcion incorrecta ❌❌❌");
                break;
        }
        
    }
    
}
