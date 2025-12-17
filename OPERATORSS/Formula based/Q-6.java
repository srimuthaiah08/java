import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        // Converting to Celsius
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        // Displaying result
        System.out.println("Temperature in Celsius = " + celsius);
    }
}
