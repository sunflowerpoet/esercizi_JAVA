/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e stampa tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.*/
public class esercizio23 {
    public static void main (String[] args) {
        int num = 12;
        countToFive(num);
    }
    public static void countToFive (int numMax) {
        for (int i = 0; i <= numMax; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}

