/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        int Ngallinas;
        int calidad=0;
        int pesog;
        int alturag;
        int nHuevos;
        double precio=0;
        System.out.println("ingrese el numero de gallinas");
        Ngallinas=scanner.nextInt();
        for(int i = 1; i <= Ngallinas; i++) {
            System.out.println("ingrese el peso de la galina"+i);
            pesog= scanner.nextInt();
             System.out.println("ingrese la altura de la galina"+i);
             alturag= scanner.nextInt();
              System.out.println("ingrese el numero de huevos que pone la galina  " +i);
              nHuevos= scanner.nextInt();
              calidad+= pesog*alturag/nHuevos;
              double promedio= calidad/Ngallinas;
              System.out.println("el promedio de las gallinas es  :" +  promedio);
              
              if(promedio>=15) {
                  precio= promedio * 1.2;
              }else if (promedio>8 && promedio <15) {
                  precio=promedio;
              }else if (promedio<=8) {
                  precio= promedio*0.8;
                  System.out.println("el pprecio del kilo de huevo es  " + precio);
                  
              }
            
        }
    }
    

    }
    

