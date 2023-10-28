/*Scrivere un programma che contenga un metodo
che permetta di rimuovere gli elementi duplicati in un array di interi.
L'array ottenuto dovrà essere stampato a video.*/
public class esercizio26 {
    public static void main(String[] args) {
        long[] inputArray = {4, 2, 4, 9, 1, 2, 9, 8, 9, 8, 7, 3, 1, 6, 9};
        long[] uniqueArray = removeDuplicates(inputArray);

        System.out.println("Original array: ");
        for (long num : inputArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray without duplicates: ");
        for (long num : uniqueArray) {
            System.out.print(num + " ");
        }
    }

    public static long[] removeDuplicates(long[] array) {
        int length = array.length;

        // Count the number of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueCount++;
            }
        }

        // Create a new array with unique elements
        long[] uniqueArray = new long[uniqueCount];
        int currentIndex = 0;
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueArray[currentIndex] = array[i];
                currentIndex++;
            }
        }
        return uniqueArray;
    }
}
