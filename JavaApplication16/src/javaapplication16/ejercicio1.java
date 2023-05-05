/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        int total_compra;
        int porcetajeDescuento = 0;
        int bola, sn;
        double descuento = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingresa el valor total de la compra: ");
            total_compra = scanner.nextInt();

            do {
                System.out.println("Por favor, ingresa que color de pelota sacaste: ");
                System.out.println("1. Blanca: ");
                System.out.println("2. Roja ");
                System.out.println("3. Amarilla");
                bola = scanner.nextInt();
                switch (bola) {
                    case 1:
                        porcetajeDescuento = 0;
                        break;
                    case 2:
                        porcetajeDescuento = 40;
                        break;
                    case 3:
                        porcetajeDescuento = 25;
                        break;
                    default:
                        System.out.println(" opcion no valida");
                }
            } while (bola < 1 || bola > 3);
            descuento = total_compra * porcetajeDescuento / 100;
            System.out.println("El descuento fue " + descuento);
            System.out.println("El total a pagar es " + (total_compra - descuento));
            System.out.println("¿Desea hacer otra compra?");
            System.out.println("1.si");
            System.out.println("2.No");
            sn = scanner.nextInt();
        } while (sn == 1);

    }
}
