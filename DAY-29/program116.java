import java.util.*;
public class program116{//inventory management system.
public static void inventory(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Product Id : ");
    int id=sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Product Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Quantity : ");
    int quantity=sc.nextInt();

    System.out.println("------Inventory------");
    System.out.println("Product Id : "+id);
    System.out.println("Product Name : "+name);
    System.out.println("Quantity : "+quantity);
}

public static void main(String args[]){
    inventory();
}
}
