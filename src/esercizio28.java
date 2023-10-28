/*Scrivere un programma che contenga un metodo che permette di inizializzare una
matrice e di scambiare le sue righe e le sue colonne stampandola a video.
Matrice di partenza

1 2 3
4 5 6
Matrice risultato

 1 4
 2 5
 3 6
 */
public class esercizio28 {
    public static void main (String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Starting matrix:");
        printMatrix(matrix);
        int[][] invertedMatrix = invertLinesColumns(matrix);

        System.out.println("\nResult matrix:");
        printMatrix(invertedMatrix);
    }
    public static int[][] invertLinesColumns(int[][] matrix) {
        int lines = matrix.length;
        int columns = matrix[0].length;
        int[][] invertedMatrix = new int[columns][lines];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                invertedMatrix[j][i] = matrix[i][j];
            }
        }
        return invertedMatrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
