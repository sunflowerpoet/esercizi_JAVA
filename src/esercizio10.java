public class esercizio10 {
    public static void main(String[] args) {
        int x = 4;
        int y = 9;
        int increase = 2;

        System.out.println("Variabile 1: " + x);
        System.out.println("Variabile 2: " + y);
        System.out.println("The result of the increase and multiplication is: " + incAndMult(x, y, increase));

    }

    public static int incAndMult(int x, int y, int increase) {
        // Increase the variables
        x += increase;
        y += increase;

        // Multiply the variables
        int result = x * y;
        return result;
    }
}

