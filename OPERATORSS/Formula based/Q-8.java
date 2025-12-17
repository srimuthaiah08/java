import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the side of the square: ");
        double side = sc.nextDouble();
        // Calculating perimeter
        double perimeter = 4 * side;
        // Displaying result
        System.out.println("Perimeter of the square = " + perimeter);
    }
}
