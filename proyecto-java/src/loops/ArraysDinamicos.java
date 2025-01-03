package loops;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraysDinamicos {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(19);
        numeros.add(20);
        numeros.add(23);

        System.out.println(numeros);

        numeros.remove(0);

        System.out.println(numeros);

        System.out.println(numeros.get(1));

        LinkedList<Integer> numeros2 = new LinkedList<>();
        numeros2.add(190);
        numeros2.get(0);

    }
}
