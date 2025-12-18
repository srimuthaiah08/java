//Write a Java Program to check whether the first digit of a 3-digit number is odd or even.




import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 100 || number > 999) {
        } else {
            int firstDigit = number / 100; 
            if (firstDigit % 2 == 0) {
                System.out.println("The first digit is Even.");
            } else {
                System.out.println("The first digit is Odd.");
            }
        }
    }
}
