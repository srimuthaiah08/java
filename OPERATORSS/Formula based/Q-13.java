import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking inputs
        System.out.print("Enter the length of the cuboid: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the cuboid: ");
        double width = sc.nextDouble();
        System.out.print("Enter the height of the cuboid: ");
        double height = sc.nextDouble();
        // Calculations
        double surfaceArea = 2 * (length * width + length * height + width * height);
        double volume = length * width * height;
        // Displaying results
        System.out.println("Surface Area of the Cuboid = " + surfaceArea);
        System.out.println("Volume of the Cuboid = " + volume);
    }
}
