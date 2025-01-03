package condicionales;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor");

        int a = sc.nextInt();
        // alterar el orden de las condiciones
        // puede afectar al resultado final
        // probar con 15

        if( a % 3 == 0 ) {
            System.out.println("Multiplo de 3");
        } else if ( a % 5 == 0) {
            System.out.println("Multiplo de 5");
        } else if ( a % 3 == 0 && a % 5 == 0) {
            System.out.println("Multiplo de tres y de cinco");
        } else {
            System.out.println("No es multiplo ni de 3 ni de 5");
        }
    }
}
