import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the side of the cube: ");
        double side = sc.nextDouble();
        // Calculations
        double surfaceArea = 6 * side * side;
        double volume = side * side * side;
        double perimeter = 12 * side;
        // Displaying results
        System.out.println("Surface Area of the Cube = " + surfaceArea);
        System.out.println("Volume of the Cube = " + volume);
        System.out.println("Perimeter of the Cube = " + perimeter);
    }
}
