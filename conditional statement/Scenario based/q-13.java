//Q13.Write a java program to display mobile battery status (full, moderate, low)..
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int battery=sc.nextInt();
        if(battery==100){
            System.out.println("Battery is full");
        }else if(battery<=100 && battery>=35){
            System.out.println("Battery is moderate");
        }else{
            System.out.println("Battery is low");
        }
    }
}

    