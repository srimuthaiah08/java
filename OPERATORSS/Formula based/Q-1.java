import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();
        int area = length * breadth;  // Area formula
        System.out.println("Area of the rectangle = " + area);
    }
}
