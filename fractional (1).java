import java.util.Scanner;
public class fractional {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a fractional number: ");
        double number = x.nextDouble();  
        System.out.printf("Formatted number: %.2f", number);
    }
}
