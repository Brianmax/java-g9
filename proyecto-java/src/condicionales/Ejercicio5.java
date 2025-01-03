package condicionales;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");

        int a = sc.nextInt();

        System.out.println("Ingrese el segundo nuemero");

        int b = sc.nextInt();

        System.out.println("Ingrese el tercer numero");

        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Mayor: " + a);
        } else if (b > a && b > c) {
            System.out.println("Mayor: " + b);
        } else {
            System.out.println("Mayor: " + c);
        }
    }
}
