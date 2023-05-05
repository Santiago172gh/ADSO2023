/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;



/**
 *
 * @author Ambiente 209-1
 */
import java.util.Scanner;
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    

        Scanner scanner = new Scanner(System.in);
        
        double totalMasaAire = 0.0;
        double masaAire ;
        int cantVehiculos = 0;
        int i,n,tipoVehiculo;
        System.out.print("Ingrese la cantidad de vehículos");
        n = scanner.nextInt();
        do {
        for ( i = 1; i <= n; i++) {
            System.out.println("Vehículo " + i  );
            System.out.println("1.moto");
              System.out.println("2.carro");
            tipoVehiculo = scanner.nextInt();
            
            switch (tipoVehiculo) {
                case 1:
                    System.out.println("Ingrese la masa de aire del neumático de la moto en kg: ");
                    masaAire = scanner.nextDouble();
                    totalMasaAire += (masaAire*2);
                    cantVehiculos++;
                    break;
                case 2:
                    System.out.println("Ingrese la masa de aire del neumático del carro en kg: ");
                    masaAire = scanner.nextDouble();
                    totalMasaAire += (masaAire * 4);
                    cantVehiculos++;
                    break;
                default:
                    System.out.println("invalido");
                    break;
            }
        }
        if (cantVehiculos == 0) {
            System.out.println("No se ingresaron vehículos.");
        } else {
            double promedioMasaAire = totalMasaAire / cantVehiculos;
            System.out.println("El promedio de masa de aire de los neumáticos es: " + promedioMasaAire + " kg.");
        }
        
        }

}
