/*Scrivere un programma che contenga un metodo che sfrutti il while loop
e prenda in ingresso 1 valore intero come limite superiore
e calcoli la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)*/
public class esercizio19 {
    public static void main (String[] args) {
        int maxNum = 20;
        System.out.println("Max value: " + maxNum);
        int sum = operation(maxNum);
        System.out.println("The sum of the numbers before " + maxNum + " is " + sum);
    }
    public static int operation (int maxNum) {
        int sum = 0;
        int numValue = 1;

        while (numValue < maxNum) {
            sum += numValue;
            numValue ++;
        }
        return sum;
    }
}
