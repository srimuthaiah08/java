//Write a Java Program to check odd or even using bitwise operator.


import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if((a & 1)==0){
            System.out.println("the number is even ");
         } else {
            System.out.println("the  number is odd ");
        }
    }
}
