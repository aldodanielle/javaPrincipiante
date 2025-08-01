/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos;

/**
 *
 * @author daniellara
 */
public class ciclorForEach {
    // bucle o ciclo For Each -> es un bucle mejorado al convensional 
    public void ejecutar(){
        String [] nombres = {"Aldo", "Melina", "Por", "Siempre", "Y", "Para", "Siempre"};
        
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
        
        
        System.out.println(" ");
        //For each -> por cada elemento
        // For(Tipo de dato NOMBRE: nombre del arreglo)
        for(String i: nombres){
            System.err.println("Nombre: " +i);
        }
    }
    
}
