import java.util.*;
public class program112{//contact management system.
public static void contact(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Mobile Number : ");
    String mobile=sc.nextLine();

    System.out.print("Enter Email : ");
    String email=sc.nextLine();

    System.out.println("------Contact Details------");
    System.out.println("Name : "+name);
    System.out.println("Mobile Number : "+mobile);
    System.out.println("Email : "+email);
}

public static void main(String args[]){
    contact();
}
}
