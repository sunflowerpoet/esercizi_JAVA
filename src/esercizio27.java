import java.util.Arrays;

/*Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice riempita con dei valori a vostro piacimento
e restituisca la somma degli elementi sulla prima riga*/
public class esercizio27 {
    public static void main (String[] args) {
        System.out.println("Input matrix:");
        System.out.println("The sum of the elements of the first line of the matrix is: " + sumMatrix(createMatrix()));
    }

    public static int [][] createMatrix() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 3;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        return matrix;
    }
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum = sum + matrix[0][i];
        }
        return sum;
    }
}
