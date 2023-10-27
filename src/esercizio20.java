/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.*/

public class esercizio20 {
    public static void main (String[] args) {
        int number = 7;
        System.out.println("Number: " + number);
        System.out.println("Arithmetic table of number " + number + " :");
        operation(number);
    }
    public static void operation (int number) {
        for (int i = 0; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
