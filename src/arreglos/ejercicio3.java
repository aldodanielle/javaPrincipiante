/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author daniellara
 */
public class ejercicio3 {
    // suma de los numeros positivos
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        float num[] = new float [5];
        float sumPos = 0, sumNeg = 0, avgPos, avgNeg;
        int contadorPos = 0, contadorNeg = 0, contadorCero = 0;
        
        System.err.println("Entrada de datos");
        for(int i = 0; i < 5; i++){
            System.out.print("Dame el dato "+(i+1)+": ");
            num[i] = entrada.nextFloat();
            
            if(num[i] > 0){
                sumPos += num[i];
                contadorPos++;
            }else if (num[i] < 0){
                sumNeg += num[i];
                contadorNeg++;
            }else{
                contadorCero++;
            }
        }
        
        avgPos = sumPos / contadorPos;
        avgNeg = sumNeg / contadorNeg;
        System.err.println("Resumen");
        System.out.println("Promedio numeros positivo: " +avgPos);
        System.out.println("Promedio numeros negativos: " +avgNeg);
        System.out.println("Tenemos: "+contadorCero+" ceros en el arreglo");
        
    }
    
}
