import java.util.*;
public class program120{//mini project using arrays, strings and functions.
public static void display(String name[],int marks[]){

    System.out.println("------Student Details------");

    for(int i=0;i<name.length;i++){
        System.out.println(name[i]+" "+marks[i]);
    }

}

public static void project(){

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

    display(name,marks);

}

public static void main(String args[]){
    project();
}
}
