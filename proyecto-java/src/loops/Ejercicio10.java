package loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de elementos del array");

        int n = sc.nextInt();

        int[] numeros = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(numeros));

        int mayor = numeros[0];

        for (int i = 0; i < n; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}
