//Q17.Write a java program to assign different ticket prices based on day of the week (weekday/weekend).
import java.util.Scanner;
public class TicketPriceByDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine().toLowerCase();
        if (day.equals("saturday") || day.equals("sunday")) {
            System.out.println("Weekend");
            System.out.println("Ticket Price: 150");
        } else {
            System.out.println("Weekday");
            System.out.println("Ticket Price: 100");
        }
    }
}


    