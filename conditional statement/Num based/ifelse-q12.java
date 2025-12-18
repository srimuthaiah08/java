//Write a Java Program to check whether the last digit of a number is odd or even.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastdigit = sc.nextInt();
        if (lastdigit%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
        }
    }

