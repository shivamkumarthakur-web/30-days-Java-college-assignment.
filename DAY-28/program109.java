import java.util.*;
public class program109{//library management system.
public static void library(){
Scanner sc=new Scanner(System.in);
    System.out.print("Enter Book Id : ");
    int id=sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Book Name : ");
    String name=sc.nextLine();

    System.out.print("Enter Author Name : ");
    String author=sc.nextLine();

    System.out.println("------Library Record------");
    System.out.println("Book Id : "+id);
    System.out.println("Book Name : "+name);
    System.out.println("Author : "+author);
}

public static void main(String args[]){
    library();
}
}
