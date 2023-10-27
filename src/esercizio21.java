/*Scrivi un programma che contenga un metodo che prende in ingresso un numero
e il massimo numero di risultati che vuoi avere e stampi tutti i numeri naturali
in ordine inverso (Quindi se passo il punto di partenza a 6 e gli dico di restituirmi
3 risultati mi aspetto in uscita [6 5 4] stampati).*/
public class esercizio21 {
    public static void main (String[] args) {
        int num = 10;
        int var = 6;
        countDown (num, var);
    }
    public static void countDown (int num, int var) {
        for(int i = num; i > num - var; i--) {
            System.out.println(i + " ");
        }
    }
}
