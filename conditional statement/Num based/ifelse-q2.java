//Write a Java Program to find Smallest among two numbers.




import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            System.out.println("Smallest Number is: " +a);
        }
        else{
            System.out.println("Smallest Number is: " +b);
        }
    }
}