/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11.pkg1.pkg4;

import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class Ejercicio1114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int totalVentas = 0;
        int numClientes = 0;
        int compra;
        int iva;
        int totalApagar;
        int cantidadPaga;
        int cambio;

        while (numClientes < 2) {
            numClientes++;
            System.out.println("Ingrese el monto total de la compra del cliente " + numClientes + ":");
            compra = teclado.nextInt();
            iva = (int) (compra * 0.19);
            totalApagar = compra + iva;
            System.out.println("El IVA de la compra es: " + iva);
            System.out.println("El total a pagar es: " + totalApagar);
            System.out.println("Ingrese la cantidad con que paga el cliente " + numClientes + ":");
            cantidadPaga = teclado.nextInt();
            cambio = cantidadPaga - totalApagar;
            System.out.println("El cambio es: " + cambio);
            totalVentas += totalApagar;
        }
        System.out.println("La cantidad de dinero en la caja es: " + totalVentas);
    }
}
