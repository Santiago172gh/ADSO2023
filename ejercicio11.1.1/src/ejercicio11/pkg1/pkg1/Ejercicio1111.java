/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.pkg1.pkg1;

/**
 *
 * @author santiago
 */
import java.util.Scanner;

public class Ejercicio1111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas;
        int estudiantes = 0;
        int aprobados = 0;

        while (estudiantes < 40) {
            System.out.println("Ingrese las 5 calificaciones del estudiante " + (estudiantes + 1) + " separadas por espacios: ");
            double suma = 0;
            for (int i = 0; i < 5; i++) {
                notas = teclado.nextInt();
                suma += notas;
            }
            double promedio = suma / 5.0;
            if (promedio < 3.0) {
                System.out.println("El estudiante " + (estudiantes + 1) + " no tiene derecho al examen de nivelación");
            } else {
                System.out.println("El estudiante " + (estudiantes + 1) + "  tiene derecho al examen de nivelación");
                aprobados++;
            }
            estudiantes++;
        }

        System.out.println("La cantidad de alumnos que tienen derecho al examen de nivelación es: " + aprobados);

    }

}
