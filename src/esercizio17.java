//Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
//e restituisca il nome del giorno della settimana come stringa o una stringa di errore
//nel caso di valore maggiore di 7 o minore di 1.

public class esercizio17 {

    public static void main (String[] args) {

        int dayNumber = 13;
        String weekDay = dayName(dayNumber);

        System.out.println("Today is: " + weekDay);

    }

    public static String dayName (int dayNumber) {

        String weekDay;

        switch (dayNumber) {
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            case 7:
                weekDay = "Sunday";
                break;
            default:
                weekDay = "error: invalid value. please, pick a number between 1 and 7.";
        }
        return weekDay;
    }
}
