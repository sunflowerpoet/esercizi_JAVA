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
