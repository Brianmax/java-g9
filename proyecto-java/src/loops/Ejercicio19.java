package loops;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");

        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("El numero " + n + " es primo");
        } else {
            System.out.println("El numero " + n + " no es primo");
        }
    }
}
