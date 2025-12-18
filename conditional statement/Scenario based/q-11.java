//Q11.Write a java program to apply % of discount based on purchase amount.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double discount;
        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 2000) {
            discount = amount * 0.10;
        } else {
            discount = amount * 0.05;
        }
        double finalAmount = amount - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Amount to be paid: " + finalAmount);
    }
}

    