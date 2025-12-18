import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int Storedpin=1234;
        int enteredpin=sc.nextInt();
        if(Storedpin==enteredpin){
            System.out.println("PIN verified successfully");
            System.out.println("Withdraw");
        }else {
            System.out.println("Invalid pin");
            System.out.println("Not proceed");
        }
    }
}