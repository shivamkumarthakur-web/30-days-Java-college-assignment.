import java.util.*;
public class program107{//salary management system.
public static void salarysystem(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Basic Salary : ");
    double basic=sc.nextDouble();

    double hra=0.20*basic;
    double da=0.10*basic;
    double totalsalary=basic+hra+da;

    System.out.println("Basic Salary : "+basic);
    System.out.println("HRA : "+hra);
    System.out.println("DA : "+da);
    System.out.println("Total Salary : "+totalsalary);
}

public static void main(String args[]){
    salarysystem();
}
}
