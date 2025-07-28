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
public class ejercicio19 {
    // Nota alumno
    public void ejecutar(){
        float nota;
        int aprobado = 0, reprobado = 0, condicionado = 0;
        
        for(int i = 1; i <= 6; i++){
            
            do{
                nota = Float.parseFloat(JOptionPane.showInputDialog("Alumno " +i+ " nota:"));
            }while(nota < 0 || nota > 10);
            
            if(nota == 4){
                condicionado++;
            }else if(nota >= 6){
                aprobado++;
            }else{
                reprobado++;
            }
        }
        
        System.out.println("Resumen Notas");
        System.out.println("Alumnos aprobados: " +aprobado);
        System.out.println("Alumnos reprobados: " +reprobado);
        System.out.println("Alumnos condicionados: " +condicionado);
    }
    
}
