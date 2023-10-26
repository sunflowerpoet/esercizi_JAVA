public class esercizio11 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;

        boolean resultEquality = compare(x, y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("The result of the equality is " + resultEquality);
    }

    public static boolean compare (int x, int y) {
        boolean equality = x == y;
        return equality;
    }
}

