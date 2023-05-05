/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int numDiputados;
        int votosAFavor = 0, votosEnContra = 0, votosAbstencion = 0;
        double porcentajeAFavor, porcentajeEnContra, porcentajeAbstencion;

        System.out.println("Ingrese la cantidad de diputados: ");
        numDiputados = scanner.nextInt();

        for (int i = 1; i <= numDiputados; i++) {
             System.out.print("Ingrese su voto: ");
            System.out.println("Diputado " + i + ":");
            System.out.println("1. A favor");
            System.out.println("2. En contra");
            System.out.println("3. Abstención");
            int voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    votosAFavor++;
                    break;
                case 2:
                    votosEnContra++;
                    break;
                case 3:
                    votosAbstencion++;
                    break;
                default:
                    System.out.println("Voto inválido");
                    i--;
                    break;
            }
        }

        porcentajeAFavor =  votosAFavor / numDiputados * 100;
        porcentajeEnContra =  votosEnContra / numDiputados * 100;
        porcentajeAbstencion = votosAbstencion / numDiputados * 100;

        System.out.println("Porcentaje de diputados a favor: " + porcentajeAFavor + "%");
        System.out.println("Porcentaje de diputados en contra " + porcentajeEnContra + "%");
        System.out.println("Porcentaje de diputados que se abstienen  " + porcentajeAbstencion + "%");
    }
}
    