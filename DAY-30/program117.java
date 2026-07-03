import java.util.*;
public class program117{//student record system using arrays and strings.
public static void studentrecord(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number of Students : ");
    int n=sc.nextInt();
    sc.nextLine();

    String name[]=new String[n];
    int marks[]=new int[n];

    for(int i=0;i<n;i++){

        System.out.print("Enter Name : ");
        name[i]=sc.nextLine();

        System.out.print("Enter Marks : ");
        marks[i]=sc.nextInt();
        sc.nextLine();
    }

    System.out.println("------Student Records------");

    for(int i=0;i<n;i++){
        System.out.println(name[i]+" "+marks[i]);
    }

}

public static void main(String args[]){
    studentrecord();
}
}
