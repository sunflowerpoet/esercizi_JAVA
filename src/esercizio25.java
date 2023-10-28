/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere 'a' o 0 in caso non ce ne siano*/

public class esercizio25 {
    public static void main(String[] args) {
        String intro = "I LOVE YOU BABY BOY";
        printChar(intro);
        char[] characters = createArray(intro);
        findA(characters);
    }

    // Metodo per stampare i caratteri separati da trattini;
    public static void printChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == ' ') {
                System.out.print("--");
            } else {
                System.out.print(character);
                if (i < str.length() - 1 && str.charAt(i + 1) != ' ') {
                    System.out.print("-");
                }
            }
        }
        System.out.println();
    }

    // Metodo per creare un array e riempirlo con i caratteri della stringa;
    public static char[] createArray(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Metodo per stampare le occorrenze dei caratteri 'a'
    public static void findA(char[] characters) {
        int countA = 0;
        for (char character : characters) {
            if (character == 'a' || character == 'A') {
                countA++;
            }
        }
        if (countA > 0) {
            System.out.println("The character 'a' appears " + countA + " times.");
        } else {
            System.out.println("The character 'a' in not present.");
        }
    }
}