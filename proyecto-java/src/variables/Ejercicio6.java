package variables;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio");

        float radio = sc.nextFloat();

        final float PI = 3.1416f;

        float area  = PI * radio * radio;

        System.out.println("El area del circulo es: " + area);

        // condicionales
    }
}
