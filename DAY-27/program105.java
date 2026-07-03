import java.util.*;
public class program105{//student record management system.
public static void studentrecord(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Roll No : ");
    int roll=sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Marks : ");
    int marks=sc.nextInt();

    System.out.println("------Student Record------");
    System.out.println("Roll No : "+roll);
    System.out.println("Name : "+name);
    System.out.println("Marks : "+marks);
}

public static void main(String args[]){
    studentrecord();
}
}
