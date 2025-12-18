//Q19.Write a java program to display mobile data usage alert – "Low Data", "Half Consumed", or "Data Over" based on usage.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liters = sc.nextInt();
        double bill = 0;
        if (liters <= 1000) {
            bill = 0;
        } 
        else if (liters <= 3000) {
            bill = (liters - 1000) * 5 / 1000.0;
        } 
        else {
            bill = (2000 * 5) / 1000.0 + (liters - 3000) * 10 / 1000.0;
        }
        System.out.println("Water Bill Amount: ₹" + bill);
    }
}


    