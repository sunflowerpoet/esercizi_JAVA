/*Scrivere un programma che contenga un metodo che permette di inizializzare
una matrice riempita con dei valori a vostro piacimento
e restituisca la somma degli elementi sulla prima riga*/
public class esercizio27 {
    public static void main (String[] args){
        int [] matrix = {10, 7, 5, 3};
        System.out.println("The sum of the elements of the matrix is: " + sumNumArr(matrix));
        System.out.print("The elements of the matrix are: [ " + matrix [0]);
        System.out.print(", " + matrix [1] + ", ");
        System.out.print(matrix [2] + ", ");
        System.out.print(matrix [3] + " ]");

    }
    public static int sumNumArr(int[] matrix) {
        int sumArr = 0;
        for (int element : matrix) {
            sumArr += element;
        }
        return sumArr;
    }
}
