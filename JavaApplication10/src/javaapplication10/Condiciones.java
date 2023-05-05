/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Ambiente 209-1
 */
public class Condiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int edad = 18;
        if (edad
                >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }

        /*
    para el conector and se utiliza &
    para el conector or se utiliza |
    definir 2 numero s e indicar cual de los dos es mayor
   
         */
        int num1 = 5;
        int num2 = 10;
        int num3 = 20;
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales.");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("el numero" + num1 + "es el mayor");
            } else {
                if (num2 > num1 && num2 > num3) {
                    System.out.println("el numero" + num2 + "es el mayor");
                } else {
                    if (num3 > num1 && num3 > num2) {
                        System.out.println("el numero" + num3 + "es el mayor");
                    }
                }
            }
        }
    }
}

