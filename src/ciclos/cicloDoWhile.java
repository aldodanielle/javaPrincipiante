/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos;

/**
 *
 * @author daniellara
 */
public class cicloDoWhile {
    //Ciclo do while -> se ejecuta por lo menos una vez  
    public void ejecutar(){
        int i = 10;
        
        do{
            System.out.println(i);
            i--;
        }while(i <= 1); // se ejecuta una vez con resultado 10
                        // NO se cumple la sentencia
                        // i >= 1 -> se cumple la sentencia
    }
    
}
