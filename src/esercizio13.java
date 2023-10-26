public class esercizio13 {
    public static void main(String[] args) {
        int x = 15;
        int y = 30;
        int compNum = 24; // valore di confronto

        boolean resultCheck = checkOp(compNum, x, y);

        System.out.println("The result of the operation is " + resultCheck);
    }

    public static boolean checkOp(int compNum, int x, int y) {

        if (compNum >= x && compNum <= y) {
            return true;
        } else {
            return false;
        }
    }
}

