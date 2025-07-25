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
public class ejercicio15 {
    // alumnos
    public void ejecutar(){
        int alumno = 1, edad, altura, mayores = 0, altos = 0;
        float sumaEdad = 0, sumAltura = 0;
        
        for(int i = 1; i <= 5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+alumno+ " edad: " ));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+alumno+ " altura: " ));
            alumno++;
            
            if(edad >= 18){
                mayores++;
            }
            
            if(altura >= 175){
                altos++;
            }
            
            sumaEdad += edad;
            sumAltura += altura;
        }
        
        sumaEdad /= 5;
        sumAltura /= 5;
        JOptionPane.showConfirmDialog(null, "Estos son los promedios"
                + "\nEdad: " +sumaEdad
                + "\nAltura: " +sumAltura
                + "\nTenemos a: " +mayores+ " alumnos mayores de edad "
                        + "\nY " +altos+ " alumnos altos" );
    }
    
}
