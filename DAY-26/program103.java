import java.util.*;
public class program103{//ATM simulation.
public static void atm(){
Scanner sc=new Scanner(System.in);
    int balance=10000;

    System.out.println("1. Check Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");

    int choice=sc.nextInt();

    if(choice==1){
        System.out.println(balance);
    }

    else if(choice==2){
        int amount=sc.nextInt();
        balance=balance+amount;
        System.out.println(balance);
    }

    else if(choice==3){
        int amount=sc.nextInt();

        if(amount<=balance){
            balance=balance-amount;
            System.out.println(balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    else{
        System.out.println("Invalid Choice");
    }

}

public static void main(String args[]){
    atm();
}
}
