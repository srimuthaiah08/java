import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
     String hex = Integer.toHexString(num);
     System.out.println("Hexadecimal value: " + hex.toUpperCase());
    }
}
