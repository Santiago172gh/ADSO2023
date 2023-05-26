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

