//Q10. Write a Java program to check whether a given number is prime or not.



import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0){
            int l=n%10;
             sum=sum+(l*l*l);
            n=n/10;
        }if(sum==temp){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not Armstrong number");
        }
        }
        }
