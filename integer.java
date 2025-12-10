import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = x.nextInt();  // Read integer input
        System.out.println("Hexadecimal format: " + Integer.toHexString(number));
    }
}
