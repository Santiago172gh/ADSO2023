/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo.unidimencional;

/**
 *
 * @author santiago
 */
import java.util.Scanner;
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // capturar 5 notas, utilizando arreglos de un estudiante y calcular el promedio de el estudiante 
      Scanner scan=new Scanner (System.in);
      float [] nota = new float[5];
      float prom=0;
      for (int i=0;i<=4;i++){
          System.out.println("Ingresa la nota "+(i+1));
          nota[i] =scan.nextFloat();
         
      }
      for (int i=0;i<=4;i++){
          prom+=nota[i];
      }
      prom=prom/5;
      prom=prom*100;
      prom=Math.round(prom);
      prom=prom/100;
        System.out.println("El promedio de sus  "+nota.length + " notas es de " +prom);
    }
    
}
