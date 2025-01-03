package loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos del array");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int sum = 0;

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.println(Arrays.toString(numeros));


        for (int i = 0; i < n; i++) {
            sum = sum + numeros[i];
        }

        System.out.println("La suma es: " + sum);
    }
}
