package loops;

public class Ejercicio5 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if( !(i % 3 == 0)) {
                System.out.println(i);
            }
        }
    }
}
