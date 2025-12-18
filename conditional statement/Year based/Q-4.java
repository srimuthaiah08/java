import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year1 = sc.nextInt();
        int year2 = sc.nextInt();
        int lastDigit1 = year1 % 10;
        int lastDigit2 = year2 % 10;
        if (lastDigit1 == lastDigit2) {
            System.out.println("Same last digit");
        } 
        else {
            System.out.println("Not same last digit");
        }

    }
}
