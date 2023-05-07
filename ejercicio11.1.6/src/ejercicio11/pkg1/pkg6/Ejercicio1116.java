/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.pkg1.pkg6;

/**
 *
 * @author santiago
 */
import java.util.Scanner;

public class Ejercicio1116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCenso;
        char sexo;
        int edad;
        char estadoCivil;
        int contador = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el número de censo:");
            numCenso = sc.nextInt();
            System.out.println("Ingrese el sexo (M/F):");
            sexo = sc.next().charAt(0);
            System.out.println("Ingrese la edad:");
            edad = sc.nextInt();
            System.out.println("Ingrese el estado civil (a.- soltero, b.- casado, c.- viudo, d.- divorciado):");
            estadoCivil = sc.next().charAt(0);

            if (sexo == 'F' && estadoCivil == 'a' && edad >= 16 && edad <= 21) {
                System.out.println("Número de censo de joven soltera: " + numCenso);
                contador++;
            }
        }

        System.out.println("Total de jóvenes solteras entre 16 y 21 años: " + contador);

    }

}
