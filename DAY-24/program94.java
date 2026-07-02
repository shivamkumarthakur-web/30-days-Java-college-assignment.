import java.util.*;
public class program94{//compress a string.
public static void compress(String str){
    int count=1;

    for(int i=0;i<str.length();i++){

        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }

        System.out.print(str.charAt(i));
        System.out.print(count);

        count=1;
    }

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    compress(str);
}
}
