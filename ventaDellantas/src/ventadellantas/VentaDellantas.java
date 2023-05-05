/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventadellantas;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;

public class VentaDellantas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num;
        int valorpagar;
        System.out.println("Ingresa la cantidad de llantas que vas a comprar");
        num = scan.nextByte();
        if (num < 5) {
            valorpagar = (num * 800);
        } else {
            valorpagar = (num * 700);
        }

        System.out.println(" el valor a pagar de por la cantidad de  " + num + " llantas, es de  $" + valorpagar);
    }

}
