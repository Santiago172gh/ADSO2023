/*
 */
package ejercicio3.pkg13.pkg1;

/**
 *
 */
public class Ejercicio3131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Almacenar en un vector los números de 1 hasta 100
        int num[] = new int[100]; //define

        for (int i = 0; i < 100; i++) {
            num[i] = i; //asigna 
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(num[i]);
        }
    }
}
