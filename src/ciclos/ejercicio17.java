/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author daniellara
 */
public class ejercicio17 {
    //5 facturas
    public void ejecutar(){
        int codigo, litros, litrosArticulo1 = 0, conteoMayorA600 = 0;
        float precioLitro, importeFactura, facturacionTotal = 0;
        
        for(int i = 1; i <= 5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo No " +i
                    + "\nCodigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo " +i
                    + "\nLitros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo " +i
                    + "\nPrecio Litros: "));
            
            importeFactura =(float) litros * precioLitro;
            facturacionTotal +=importeFactura;
            
            if(codigo == 1){
                litrosArticulo1 += litros;
            }
            
            if(importeFactura >= 600){
                conteoMayorA600++;
            }
        }
        
        System.out.println("Resumen Ventas");
        System.out.println("Facturacion total: "+facturacionTotal);
        System.out.println("Litros del articulo uno: " +litrosArticulo1);
        System.out.println("Facura mayores a 600: " +conteoMayorA600);

    }
}
