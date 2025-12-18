//Write a Java Program to check whether the difference between two numbers is even or odd.



import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int d=Math.abs(n-s);
        if(d%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}