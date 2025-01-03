package loops;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        int[] edades = new int[6];

        float[] estaturas = {1.3f, 1.5f, 1.9f};

        edades[3] = 5;
        edades[1] = 12;
        edades[5] = 2;

        estaturas[2] = 1.8f;


        /*System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
        System.out.println(edades[3]);
        System.out.println(edades[4]);
        System.out.println(edades[5]); */

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
    }
}
