/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13.pkg3.pkg6;

import java.util.Scanner;

public class Ejercicio1336 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contar;
        
        System.out.println("Ingrese hasta qué número desea contar: ");
        contar = scan.nextInt();
        
        int[] num = new int[contar];
        
        for (int i = 0; i < contar; i++) {
            num[i] = i + 1;
        }
        
        for (int i = 0; i < contar; i++) {
            if (num[i] < 500) {
                System.out.println("Número: " + num[i]);
            }
        }
    }
}


import java.util.Scanner;

public class Ejercicio1336 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int contar;
        
        System.out.println("Ingrese hasta qué número desea contar: ");
        contar = scan.nextInt();
        
        int[] num = new int[contar];
        
        for (int i = 0; i < contar; i++) {
            num[i] = i + 1;
        }
        
        System.out.println("Números primos:");
        
        for (int i = 0; i < contar; i++) {
            if (esPrimo(num[i])) {
                System.out.println("Número primo: " + num[i]);
            }
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}



