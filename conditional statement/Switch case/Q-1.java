import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("sum = " + (num1 + num2));
                break;
            case '-':
                System.out.println("sum = " + (num1 - num2));
                break;
            case '*':
                System.out.println("sum = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("sum = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not allowed");
                break;
            case '%':
                if (num2 != 0)
                    System.out.println("sum = " + (num1 % num2));
                else
                    System.out.println("Modulo by zero is not allowed");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
