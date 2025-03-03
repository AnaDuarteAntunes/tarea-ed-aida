
package com.cursosjava.tarea_euroconversor;

import java.util.Scanner;


public class Tarea_euroconversor {

    public static void main(String[] args) {
        
        
        //Declaramos variables
        double numero1;
        
    
        
        //Creamos la instancia del objecto scanner
        Scanner datos=new Scanner(System.in);
        
        //PEdimos por pantalla importe a convertir
        System.out.println("Inserta el importe en euros que deseas convertir");
        numero1=datos.nextDouble();
        
        //Resultado
        System.out.println("El importe introducido corresponde a " + numero1*1.076 + "Dolares Americanos");
        
         
        
    }
}
