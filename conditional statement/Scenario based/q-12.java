//Q12.Write a java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp<10){
            System.out.println("the condition is cold");
        }else if(temp<=20){
            System.out.println("the condition is pleasant");
        }else if(temp<=30){
            System.out.println("the condition is hot");
        }else{
            System.out.println("the condition is heatwave");
        }
    }
}

    