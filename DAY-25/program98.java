import java.util.*;
public class program98{//find common characters in strings.
public static void commoncharacters(String str1,String str2){
    for(int i=0;i<str1.length();i++){

        char ch=str1.charAt(i);

        if(str2.indexOf(ch)!=-1){
            System.out.print(ch+" ");
        }

    }

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str1=sc.nextLine();
    String str2=sc.nextLine();

    commoncharacters(str1,str2);
}
}
