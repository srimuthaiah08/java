import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = sc.nextDouble();
        // Calculate surface area and volume
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        // Output results
        System.out.println("Surface Area of Sphere = " + surfaceArea);
        System.out.println("Volume of Sphere = " + volume);
    }
}
