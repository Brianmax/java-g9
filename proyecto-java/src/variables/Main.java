package variables;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hola mundo");
        System.out.println("Hola desde Java");

        // variables

        int vidas = 3;
        int edad = 27;
        float estatura = 1.7f;
        double precio = 2.2323;
        char letra = 't';

        String nombre = "George";

        System.out.println(edad);
        System.out.println(estatura);

        System.out.println("Hola mi nombre es " + nombre + " tengo " + edad + " anios");


        // hola mi nombre es George, tengo 27 anios y vivo en la ciudad de arequipa

        String ciudad = "Arequipa";

        System.out.println("Hola mi nombre es " + nombre + " tengo \n" +
                 edad + " anios y vivo en la ciudad" + ciudad);

        // operaciones con variables

        // opearador +

        int a = 10;
        int b = 20;

        int resultado = a + b;

        String str1 = "10";
        String str2 = "20";

        System.out.println(str1 + str2);

        // string no trabaja con operador - / *

        a = 25;

        //a = a + b; // a += b

        a += b;
        System.out.println(a);
        // constantes

        final int CONS1 = 190;

        // cons1 = 300; no se puede modificar

        // division


        float num1 = 13;
        float num2 = 6;

        float division = num1 / num2;

        // --> int / int => int
        // --> int / float => float
        // --> float / float => float

        System.out.println(division);


    }
}