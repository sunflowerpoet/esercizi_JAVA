/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.*/
public class esercizio22 {
    public static void main (String[] args) {
        int num = 12;
        countToFive(num);
    }
    public static void countToFive (int numMax) {
        for (int i = 0; i <= numMax; i++) {
            System.out.println(i);

            if (i == 5) {
                System.out.println("End of loop.");
                break;
            }
        }
    }
}
