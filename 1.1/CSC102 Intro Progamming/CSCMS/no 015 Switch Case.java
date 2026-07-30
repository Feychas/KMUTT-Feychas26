import java.util.Scanner;

public class DayDetective {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String day = x.nextLine().trim();
        String fortune = "", unfortune = "";

        switch (day) {
            case "Monday" : 
            fortune = "Purple";
            unfortune = "Red";
            break;

            case "Tuesday" : 
            fortune = "Orange";
            unfortune = "Yellow, White";
            break;

            case "Wednesday" : 
            fortune = "Black, Brown, Gray";
            unfortune = "Pink";
            break;

            case "Thursday" : 
            fortune = "Red";
            unfortune = "Purple";
            break; 

            case "Friday" : 
            fortune = "Pink";
            unfortune = "Black, Blue, Gray";
            break;

            case "Saturday" : 
            fortune = "Blue, Baby Blue";
            unfortune = "Green";
            break;

            case "Sunday" : 
            fortune = "Green";
            unfortune = "Blue, Baby Blue";
            break;

            default :
            System.out.println("Input is invalid");
            return;

        }

        System.out.println("Fortune : " + fortune);
        System.out.println("Unfortunate : " + unfortune);
    }
}
