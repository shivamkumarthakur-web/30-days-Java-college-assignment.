import java.util.*;
public class program84{//convert lowercase to uppercase.
public static void uppercase(String str){
    for(int i=0;i<str.length();i++){

        char ch=str.charAt(i);

        if(ch>='a' && ch<='z'){
            System.out.print((char)(ch-32));
        }
        else{
            System.out.print(ch);
        }

    }

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    uppercase(str);
}
}
