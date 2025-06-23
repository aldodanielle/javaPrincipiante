/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author daniellara
 */
public class opAritmeticosAsignacion {
    public void ejecutar(){
        int num = 10, num1 = 10, num2 = 10, num3 = 10, num4 = 10;
        
        num += 10;  // num = num + 10;
        num1 -= 5;   // num1 = num1 - 5;
        num2 *= 2;   // num2 = num2 * 2;
        num3 /= 2;   // num3 = num3 / 2;
        num4 %= 3;   // num4 = num4 % 3;
        
        
        System.out.println("Suma: " +num);
        System.out.println("Resta: " +num1);
        System.out.println("Multi: " +num2);
        System.out.println("Div: " +num3);
        System.out.println("Residuo: " +num4);
    }
    
}
