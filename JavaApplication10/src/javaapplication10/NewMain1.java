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

public class NewMain1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float not1, not2, not3, prom;
        System.out.println("ingresa la primera nota");
        not1 = scan.nextFloat();
        System.out.println("ingresa la segunda nota");
        not2 = scan.nextFloat();
        System.out.println("ingresa la tercera nota");
        not3 = scan.nextFloat();
        prom = (not1 + not2 + not3) / 3;
        if (prom >= 3.0) {
            System.out.println("tu promedio es de  " + prom);
            System.out.println("eso significa que pasaste!!!");
        } else {

            System.out.println("tu promedio es de  " + prom);
            System.out.println("significa que perdiste");
        }

    }

}


