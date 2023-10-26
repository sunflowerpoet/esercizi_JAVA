public class esercizio8 {
    public static void main(String[] args) {
        int x = 9;
        int y = 27;
        int z = 3;

        double average = findAv(x, y, z);

        System.out.println("The average number is: " + average);
    }

    public static double findAv(int x, int y, int z) {
        double sum = x + y + z;
        double average = sum / 3;
        return average;
    }
}

