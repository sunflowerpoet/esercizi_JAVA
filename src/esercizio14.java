public class esercizio14 {
    public static void main (String[]args) {
        int x = 7;

        String result = operation (x);

        System.out.println(result);
    }

    public static String operation (int x) {
        return (x % 2 == 0) ? "The number " + x + " is even." : "The number " + x + " is odd.";

    }
}
