//Write a Java Program to check whether the last digit of a number is divisible by 3.


import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int lastdigit=a%10;
        if(lastdigit%3==0){
            System.out.println("the last digit of a number is divisible by 3 ");
         } else {
            System.out.println("the  last digit of a number is not divisible by 3 ");
        }
    }
}
