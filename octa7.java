import java.util.Scanner;
public class Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String oct = Integer.toOctalString(num);
        System.out.println("Octal value: " + oct);
    }
}
