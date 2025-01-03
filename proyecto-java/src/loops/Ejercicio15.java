package loops;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de libros");

        int n = sc.nextInt();

        System.out.println("Ingrese el tiempo en minutos");

        int t = sc.nextInt();

        ArrayList<Integer> tiempos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrse el tiempo de lectura del libro :" + (i + 1));

            int t1 = sc.nextInt();

            tiempos.add(t1);
        }

        Collections.sort(tiempos);
        System.out.println(tiempos);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(t >= tiempos.get(i)) {
                count++;
                t = t - tiempos.get(i);
            }
        }

        System.out.println("Numero de libros leidos: " + count );
    }
}
