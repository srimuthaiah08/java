import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if (temp > 98) {
            System.out.println("Fever");
        } 
        else {
            System.out.println("Normal Temperature");
        }
    }
}
