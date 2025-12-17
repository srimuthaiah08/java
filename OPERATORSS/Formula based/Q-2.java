import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();
        int area = side * side;  // Area formula
        System.out.println("Area of the square = " + area);
    }
}
