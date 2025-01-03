package variables;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el valor del ancho");
        float ancho = sc.nextFloat();
        System.out.println("Ingrese el valor del largo");
        float largo = sc.nextFloat();

        float area = ancho * largo;

        System.out.println("El area es: " + area);

    }
}
