/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class suif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("1. para opcion A");
        System.out.println("2. para opcion B");
        System.out.println("3. para opcion c");
        opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingresaste a la opcion A");
                break;
            case 2:
                System.out.println("Ingresaste a la opcion B");
                break;
            case 3:
                System.out.println("ingresaste a la opcion C");
                break;
            default:
                System.out.println("Opción no valida");
        }

    }

}
