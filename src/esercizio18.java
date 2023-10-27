/* Scrivi un programma che contenga un metodo che prende in ingresso un carattere
e ne identifica il tipo per un operazione di algebra (+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore. */

public class esercizio18 {
    public static void main (String[] args) {
        char algebra = '+';
        String opType = operation(algebra);

        System.out.println("Char: " + algebra);
        System.out.println("Type of operation: " + opType);
    }
    public static String operation (char algebra) {

        String opType;
        switch (algebra) {
            case '+':
                opType = "sum";
                break;
            case '-':
                opType = "subtraction";
                break;
            case '*':
                opType = "multiplication";
                break;
            case '/':
                opType = "division";
                break;
            default:
                opType = "error: invalid char";
        }
        return opType;
    }
}
