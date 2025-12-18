//Write a Java Program to check whether a number is a 3-digit number or not.



import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=100 && n<=1000||n<=-100 && n<=-999){
            System.out.println("the number is three-digit ");
        }
        else{
            System.out.println("the number is not three digit");
        }
    }
}