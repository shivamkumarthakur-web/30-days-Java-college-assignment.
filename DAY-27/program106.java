import java.util.*;
public class program106{//employee management system.
public static void employeerecord(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Employee Id : ");
    int id=sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Employee Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Salary : ");
    double salary=sc.nextDouble();

    System.out.println("------Employee Record------");
    System.out.println("Employee Id : "+id);
    System.out.println("Employee Name : "+name);
    System.out.println("Salary : "+salary);
}

public static void main(String args[]){
    employeerecord();
}
}
