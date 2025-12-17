import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        // Calculating perimeter
        double perimeter = 2 * (length + width);
        // Displaying result
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }
}
