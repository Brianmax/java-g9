package condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");

        int n = sc.nextInt();

        if( n > 0) {
            System.out.println("Numero positivo");
        } else if (n < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Cero");
        }
    }
}
