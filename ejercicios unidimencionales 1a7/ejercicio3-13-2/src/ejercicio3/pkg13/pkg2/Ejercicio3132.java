/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3.pkg13.pkg2;

import java.util.Scanner;

/**
 *
 * @author Maira Alejandra
 */
public class Ejercicio3132 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Almacenar en un vector los números de 1 hasta n.
        Scanner scan= new Scanner(System.in);
        
        int contar;
        
        System.out.println("ingrese hasta donde deseas contar ");
        contar=scan.nextInt();
        
         int [] num= new int[contar];
         
          for (int i = 0; i < contar; i++) {
            num[i] = i; //asigna 
        }
        for (int i = 0; i < contar; i++) {
            System.out.println("numero "+num[i]);
        }
        
      
         
    }
    
}
