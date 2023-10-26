public class esercizio12 {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        boolean resultComparison = compare(a, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("The result of the comparison is " + resultComparison);
    }

    public static boolean compare (char a, char b) {
        boolean comparison = a != b;
        return comparison;
    }
}

