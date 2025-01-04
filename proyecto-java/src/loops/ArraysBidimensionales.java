package loops;

public class ArraysBidimensionales {
    public static void main(String[] args) {
        int[][] arrayBidimensional = new int[3][3];

        // inicializar "arrayBidimensional" con valores aleatorios

        int[][] arrayBidimensional2 = {{0,2,3,8}, {1,5,2,9},{4,2,1,0}};

        for (int i = 0; i < arrayBidimensional2.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arrayBidimensional2[i][j]);
            }
        }
    }
}
