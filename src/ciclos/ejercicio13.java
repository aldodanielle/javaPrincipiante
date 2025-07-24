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
public class ejercicio13 {
    // media de numero Positivos y Negativos
    public void ejecutar(){
        int num, sumPos = 0, conPos = 0, sumNeg = 0, contNeg = 0, contCeros = 0;
        float mediaPos, mediaNeg;
        
        for(int i = 1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Dame un numero: "));
            
            if(num == 0){
                contCeros++;
            }else if(num > 0){
                sumPos += num;
                conPos++;
            }else{
                sumNeg += num;
                contNeg++;
            } 
        }
        
        if(conPos == 0){
            System.err.println("No existen numero ++Positivos++");
        }else{
            mediaPos = (float) sumPos/conPos;
            System.out.println("Promedio numeros positivos: " +mediaPos);
        }
        
        if(contNeg == 0){
            System.err.println("No existen numero --Negativos--");
        }else{
            mediaNeg = (float) sumNeg/contNeg;
            System.out.println("Promedio numeros negativos: " +mediaNeg);
        }
        
        System.out.println("Cantidad de ceros: " +contCeros);
    }
    
}
