
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, resultado;
        int op;

        System.out.println("A continuación ingresa el primer número");
        num1 = scan.nextInt();
        System.out.println("Ingrese el segundo número ");
        num2 = scan.nextInt();

        System.out.println(" BIENVENIDO A LA CALUCULADORA");
        System.out.println(" seleciona la operacion que deseas realizar");
        System.out.println(" 1.suma");
        System.out.println(" 2.resta ");
        System.out.println(" 3.multiplicacion");
        System.out.println(" 4.division");
        op = scan.nextInt();

        switch (op) {
            case 1:
                resultado = num1 + num2;
                System.out.println(" El resultado de la suma es   " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(" El resultado de la resta es   " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(" El resultado de la multiplicación es   " + resultado);
            case 4:
                if (num2 == 0) {
                    System.out.println(" Error: No es posible dividir entre cero ");
                } else {
                    resultado = num1 / num2;
                    System.out.println(" El resultado de la división es   " + resultado);
                }
                break;
            default:
                System.out.println(" Opción no valida ");
        }

    }
}
