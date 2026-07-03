import java.util.*;
public class program118{//mini library system.
public static void library(){
Scanner sc=new Scanner(System.in);
    String books[]={"Java","Python","C++","DSA"};

    System.out.println("Available Books");

    for(int i=0;i<books.length;i++){
        System.out.println(books[i]);
    }

    System.out.print("Enter Book Name : ");
    String book=sc.nextLine();

    boolean found=false;

    for(int i=0;i<books.length;i++){

        if(books[i].equalsIgnoreCase(book)){
            found=true;
            break;
        }

    }

    if(found){
        System.out.println("Book Available");
    }
    else{
        System.out.println("Book Not Available");
    }

}

public static void main(String args[]){
    library();
}
}
