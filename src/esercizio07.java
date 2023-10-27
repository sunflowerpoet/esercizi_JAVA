public class esercizio07 {
    public static void main (String[]args) {
        int x = 10;
        int y = 2;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("The result of the division is = " + resultDiv(x, y));
    }

    public static int resultDiv(int x, int y) {
        int division = x / y;
        return division;
    }
}

