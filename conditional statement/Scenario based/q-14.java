//Q14.Write a java program to assign ticket price based on passenger age (child, adult, senior).
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Age=sc.nextInt();
        if(Age<12){
            System.out.println("Ticket price is 50");
            System.out.println("category:Child");
        }else if(Age<60){
            System.out.println("Ticket price is 100");
            System.out.println("Category:Adult");
        }else{
            System.out.println("Ticket price is 70");
            System.out.println("Category:Senior");
        }
    }
}

    