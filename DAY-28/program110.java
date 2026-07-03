import java.util.*;
public class program110{//bank account system.
public static void bankaccount(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Account Number : ");
    int account=sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Account Holder Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Balance : ");
    double balance=sc.nextDouble();

    System.out.println("------Bank Account------");
    System.out.println("Account Number : "+account);
    System.out.println("Account Holder : "+name);
    System.out.println("Balance : "+balance);
}

public static void main(String args[]){
    bankaccount();
}
}
