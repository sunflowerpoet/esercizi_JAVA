public class esercizio6 {
    public static void main(String[] args) {

        String myString = "My name is Anna";

        int length = lengthCalc(myString);

        System.out.println("The length of my string: " + length);
    }
    public static int lengthCalc(String input) {
        return input.length();
    }
}

