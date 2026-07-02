import java.util.*;
public class program96{//remove duplicate characters.
public static void removeduplicates(String str){
    String result="";

    for(int i=0;i<str.length();i++){

        char ch=str.charAt(i);

        if(result.indexOf(ch)==-1){
            result=result+ch;
        }

    }

    System.out.println(result);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    removeduplicates(str);
}
}
