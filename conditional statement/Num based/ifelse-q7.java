//Write a Java Program to find smallest among three numbers.



import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<=b && a<=c){
            System.out.println("the Smallest number is :" +a);
        }
       else if(b<=a && b<=c){
            System.out.println("the smallest number is :" +b);
        }
        else{
            System.out.println("the  Smallest number is :" +c);
        }
    }
}