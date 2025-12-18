import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double discount = 0;
        if (bill >= 5000) {
            discount = bill * 0.20;   
        } 
        else if (bill >= 3000) {
            discount = bill * 0.15;   
        } 
        else if (bill >= 1000) {
            discount = bill * 0.10;   
        } 
        else {
            discount = 0;            
        }
        double finalAmount = bill - discount;
        System.out.println("Discount = " + discount);
        System.out.println("Amount to Pay = " + finalAmount);
    }
}
