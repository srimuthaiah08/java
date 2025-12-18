//Q9.Write a java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).



import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       // int Withdrawal=100000;
        int balance=sc.nextInt();
                int Withdrawal=sc.nextInt();

        if(Withdrawal<=balance && Withdrawal%100==0){
            System.out.println("withdraw successful");
        }else{
            System.out.println("withdraw failed!");
            if(Withdrawal>balance){
                System.out.println("Insufficient balance");
            }
            if(Withdrawal%100!=0){
                System.out.println("Amount must be multiply of 100");
            }
        }
    }
}
        
    