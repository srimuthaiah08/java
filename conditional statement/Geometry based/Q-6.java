import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && d > 0) {
            if (a == b && b == c && c == d) {
                System.out.println("Square");
            } 
            else if (a == c && b == d) {
                System.out.println("Rectangle");
            } 
            else {
                System.out.println("Neither Square nor Rectangle");
            }
        } 
        else {
            System.out.println("Invalid sides");
        }
    }
}
