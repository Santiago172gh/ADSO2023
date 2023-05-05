/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplo5x;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class Multiplo5x {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner scan=new Scanner (System.in);
  int num;
        System.out.println("Ingresa un numero");
        num=scan.nextInt();
                if (num%5==0){
                    System.out.println("el numero es multiplo de 5");
                }else
                {System.out.println("el numero no es multipo de 5");
        
    }
    
}
}
