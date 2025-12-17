import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        // Calculating area
        double area = Math.PI * radius * radius;
        // Displaying result
        System.out.println("Area of the circle = " + area);
    }
}
