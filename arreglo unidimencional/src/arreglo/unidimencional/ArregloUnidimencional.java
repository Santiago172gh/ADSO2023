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
public class ArregloUnidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //para definir un arreglo se define el tipo de dato []
        // nombre de la variable 
        // new tipo_dato [longitud maxima]
// queda = int[] = new "tipo de dato" [longitud maxima];

        int[] numeros = new int[5];
        String[] palabras = new String[5];
        boolean[] valores = new boolean[5];

        //para guardar valores
        //nombre_arreglo [posicion]=valor a guardar
        //ejemplo numeros[0]=5;
        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 56;
        numeros[3] = 51;
        numeros[4] = 3;
        //para mostrar los valores es   
        // System.out.println(numeros[posicion]);
System.out.println (numeros[0]);
System.out.println (numeros[1]);
System.out.println (numeros[2]);
System.out.println (numeros[3]);
System.out.println (numeros[4]);
        //
        //ejercicio para caragar los valores del arreglo 
        //un ciclo 
        Scanner scan=new Scanner (System.in);
        
        for (int i=1;i<=5;i++ ) {
            System.out.println(" Ingrese el valor de la posicion " +i);
            numeros[i]=scan.nextInt();
                    
        }
                
        
    }

}
