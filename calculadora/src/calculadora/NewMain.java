/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1, num2, resultado;
        int op;

        System.out.println(" BIENVENIDO A LA CALUCULADORA");
        System.out.println(" seleciona la operacion que deseas realizar");
        System.out.println(" 1.suma");
        System.out.println(" 2.resta ");
        System.out.println(" 3.multiplicacion");
        System.out.println(" 4.division");
        op = scan.nextInt();
System.out.println("A continuación ingresa el primer número");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo número ");
                num2 = scan.nextFloat();
        
        switch (op) {
            case 1:
                System.out.println("Ingresaste a la opcion suma");
                System.out.println("A continuación ingresa el primer número");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo número ");
                num2 = scan.nextFloat();
                resultado = num1 + num2;
                System.out.println(" El resultado de la suma es   " + resultado);
                break;
            case 2:
                System.out.println("Ingresaste a la opcion resta");
                System.out.println("A continuación ingresa el primer número");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo número ");
                num2 = scan.nextFloat();
                resultado = num1 - num2;
                System.out.println(" El resultado de la resta es   " + resultado);
                break;
            case 3:
                System.out.println("ingresaste a la opcion multiplicación");
                System.out.println(" A continuación ingresa el primer número ");
                num1 = scan.nextFloat();
                System.out.println(" Ingrese el segundo número ");
                num2 = scan.nextFloat();
                resultado = num1 * num2;
                System.out.println(" El resultado de la multiplicación es   " + resultado);
            case 4:
                System.out.println("ingresaste a la opcion división");
                System.out.println("A continuación ingresa el primer número");
                num1 = scan.nextFloat();
                System.out.println("Ingrese el segundo número ");
                num2 = scan.nextFloat();
                resultado = num1 / num2;
                System.out.println(" El resultado de la división es   " + resultado);
                break;
            default:
                System.out.println("Opción no valida");

        }

    }
}
