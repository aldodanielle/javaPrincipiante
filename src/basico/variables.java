/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basico;

/**
 *
 * @author daniellara
 */
public class variables {
    
    public void ejecutar(){
        System.out.println("Tipo de variables");
        System.out.println("Entero");

        
        byte n1 = 10;           // solo valores de -128 a 127
        short n2 = 16250;       // solo valores de -32,768 a 32,767
        int n3 = 23456781;      // solo valores de -2,147,483,648 a 2,147,483,647
        long n4 = 657362442;    //solo valore de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        
        System.out.println("Valor de byte: " +n1);
        System.out.println("Valor de short: " +n2);
        System.out.println("Valor de int: " +n3);
        System.out.println("Valor de long: " +n4);

        
        System.out.println("");
        System.out.println("");
        System.out.println("Flotante o Reales");
        
        float n5 = 12.6f;           // Solo valores de 1.4e-045 a 3.4e+038
        double n6 = 234.6532423;    // Solo valores de 4.9e-324 a 1.8e+308
        
        System.out.println("Valor de float: " +n5);
        System.out.println("Valor de double: "+n6);


        System.out.println("");
        System.out.println("");
        System.out.println("Caracter");
        
        char c1 = 'a';      // Cualquier valor del teclado
        
        System.out.println("Valor de caracter: " +c1);
        

        System.out.println("");
        System.out.println("");
        System.out.println("Boolean");
        
        boolean b1 = true;      // solo es Verdad o Falso
        boolean b2 = false;
        
        System.out.println("La decision de Daniel es: " +b1);
        System.out.println("La decision de Aldo es: " +b2);
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("Cadena");
        
        String nombre = "Aldo";
        String apellido = "Lara";
        String edad = "26 años";
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Nombre completo: " + nombre + " " +apellido);
        System.out.println("Nombre y edad: " + nombre + " " + apellido + " " + edad);
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("NO Primitivos");
        
        Integer numero1 = 10;
        Integer numero2 = null;
        
        //numero2.compareTo(numero1);     //Uso de uno de lo metodos que ofrecen los datos primitivos
        
        System.out.println("Valor de Intger 1: " +numero1);
        System.out.println("Valor de Intger 2: " +numero2);
        
       //System.out.println("" +numero2.compareTo(numero1));

       
        System.out.println("");
        System.out.println("");
        System.out.println("Constante");    // NO cambia el valor
        
        final int lada = 687;
        final String pais = "mx";
        
        // int = 712;   // Marca error porque NO se puede cambiar
        
        System.out.println("Lada telefonica: " +lada);
        System.out.println("Pais: " +pais);
    }
}
