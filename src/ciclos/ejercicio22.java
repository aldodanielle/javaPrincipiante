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
public class ejercicio22 {
    // suspendido
    public void ejecutar(){
        int alumno, NoReprobado = 0;
        boolean reprobado = false;
        
        for(int i = 1; i <= 5; i++){
            alumno = Integer.parseInt(JOptionPane.showInputDialog("Calificacion del alumno " +i+ ":"));
            
            if(alumno <= 5){
                reprobado = true;
                NoReprobado++;
            }
        }
        
        if(reprobado == true){
            System.err.println("Existe alumnos reprobados");
            System.err.println("Los alumnos reprobados son: " +NoReprobado);
        }else{
            System.out.println("Felicidades NO existe alumnos reprobados");
        }
    }
    
}
