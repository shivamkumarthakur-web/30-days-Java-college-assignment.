import java.util.*;
public class program88{//remove spaces from string.
public static void removespaces(String str){
    for(int i=0;i<str.length();i++){

        if(str.charAt(i)!=' '){
            System.out.print(str.charAt(i));
        }

    }

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    removespaces(str);
}
}
