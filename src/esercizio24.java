/*Scrivi un programma che contenga un metodo che crea un array
e lo riempie con i numeri da 1 a 10 e che che calcoli la somma
dei numeri contenuti nell'array inizializzato e la stampi a video.*/

public class esercizio24 {
    public static void main (String[] args) {
        int[] array = createArray();
        System.out.println("The sum of the elements of the array is: " + sumNumArr(array));
    }
    public static int[] createArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i ++) {
            array[i] = i + 1;
        }
        return array;
    }
    public static int sumNumArr(int[] array) {
        int sumArr = 0;
        for (int element : array) {
            sumArr += element;
        }
        return sumArr;
    }
}
