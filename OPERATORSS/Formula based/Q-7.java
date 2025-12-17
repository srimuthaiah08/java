import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        // Converting to Fahrenheit
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        // Displaying result
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
