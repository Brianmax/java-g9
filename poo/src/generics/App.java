package generics;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        //Punto2D punto2D_1 = new Punto2D(2,4);
        //Punto2D punto2D_2 = new Punto2D(3.2f, 23.3f);

        Punto2D<Integer> punto2D_1 = new Punto2D<>(1,2);
        Punto2D<String> punto2D_2 = new Punto2D<>("Hola", "Mundo");

    }
}
