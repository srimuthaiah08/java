//Write a Java Program to check whether a character is digit or not.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= '0' && ch <= '9')  {
            System.out.println("The character is an digit");
        } else {
            System.out.println("The character is not an digit");
        }
    }
}



