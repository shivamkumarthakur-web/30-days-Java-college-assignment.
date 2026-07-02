import java.util.*;
public class program93{//check string rotation.
public static boolean isrotation(String str1,String str2){
    if(str1.length()!=str2.length()){
        return false;
    }

    String temp=str1+str1;

    if(temp.contains(str2)){
        return true;
    }

    return false;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str1=sc.nextLine();
    String str2=sc.nextLine();

    System.out.println(isrotation(str1,str2));
}
}
