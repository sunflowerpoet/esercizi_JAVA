//Scrivi un programma che calcoli la lunghezza di una stringa,
//sulla base di questa lunghezza stampi "Lunghezza maggiore di 10",
//"Lunghezza minore di 10" o "Lunghezza pari a 10".
public class esercizio16 {
    public static void main (String[]args) {

        String x = "My name is Anna";

        int length = x.length();

        System.out.println("Input string: " + x);
        System.out.println("Length of string x: " + length);

        if (length > 10) {
            System.out.println("Length of sting: > 10");
        } else if (length < 10) {
            System.out.println("Length of the string: < 10");
        } else {
            System.out.println("Length of the string: =10");
        }
    }
}


