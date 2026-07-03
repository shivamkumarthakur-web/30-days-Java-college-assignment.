import java.util.*;
public class program119{//mini employee management system.
public static void employee(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number of Employees : ");
    int n=sc.nextInt();
    sc.nextLine();

    String name[]=new String[n];
    double salary[]=new double[n];

    for(int i=0;i<n;i++){

        System.out.print("Enter Employee Name : ");
        name[i]=sc.nextLine();

        System.out.print("Enter Salary : ");
        salary[i]=sc.nextDouble();
        sc.nextLine();
    }

    System.out.println("------Employee Records------");

    for(int i=0;i<n;i++){
        System.out.println(name[i]+" "+salary[i]);
    }

}

public static void main(String args[]){
    employee();
}
}
