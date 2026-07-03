import java.util.*;
public class program108{//marksheet generation system.
public static void marksheet(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Student Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Marks of Subject 1 : ");
    int sub1=sc.nextInt();

    System.out.print("Enter Marks of Subject 2 : ");
    int sub2=sc.nextInt();

    System.out.print("Enter Marks of Subject 3 : ");
    int sub3=sc.nextInt();

    int total=sub1+sub2+sub3;
    double percentage=total/3.0;

    System.out.println("------Marksheet------");
    System.out.println("Name : "+name);
    System.out.println("Total Marks : "+total);
    System.out.println("Percentage : "+percentage);

    if(percentage>=40){
        System.out.println("Result : Pass");
    }
    else{
        System.out.println("Result : Fail");
    }
}

public static void main(String args[]){
    marksheet();
}
}
