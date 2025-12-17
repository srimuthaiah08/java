import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        // Calculations
        double surfaceArea = 2 * Math.PI * radius * (radius + height); // Total Surface Area
        double volume = Math.PI * radius * radius * height;            // Volume
        // Output
        System.out.println("Surface Area of Cylinder = " + surfaceArea);
        System.out.println("Volume of Cylinder = " + volume);
    }
}
