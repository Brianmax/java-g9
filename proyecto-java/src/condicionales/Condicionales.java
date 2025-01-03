package condicionales;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        // permita al usuario ingresar su edad y determine
        // si es mayor de edad o menor de edad

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");

        int edad = sc.nextInt();

        if(edad >= 18) {
            System.out.println("Persona mayor de edad");
        } else {
            System.out.println("Persona menor de edad");
        }

        System.out.println(15 % 2);
    }
}
