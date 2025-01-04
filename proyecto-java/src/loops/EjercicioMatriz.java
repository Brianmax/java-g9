package loops;

public class EjercicioMatriz {
    public static void main(String[] args) {
        int[][] arrayBidimensional = new int[3][3];

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < 3; j++) {
                arrayBidimensional[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arrayBidimensional[i][j]);
            }
        }


        for (int i = 0; i < 3; i++) {
            int a = 10;
            // codeee
        }

        int a = 10;
    }
}
