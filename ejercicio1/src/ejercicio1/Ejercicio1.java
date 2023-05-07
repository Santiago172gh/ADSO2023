/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author santiago
 */
    import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   double total_compra;
        int bola;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa el valor de la compra: ");
        total_compra= scanner.nextDouble();
        System.out.println("por favor, ingresa el color de la pelota que sacaste");
        System.out.println("1. blanca");
        System.out.println("2. roja");
        System.out.println("3. amarilla");
        bola=scanner.nextInt();
        switch(bola){ 
            case 1:
                total_compra=total_compra;
                break;
            case 2:
                total_compra*=0.40;
                break;
            case 3:
                total_compra*=0.25;
                break;
            default:
                System.out.println("opcion no valida");
                }
        System.out.println("el valor a pagar es de" + total_compra);
         
    }
    }
