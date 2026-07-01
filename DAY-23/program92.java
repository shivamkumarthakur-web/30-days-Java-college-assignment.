import java.util.*;
public class program92{//find maximum occurring character.
public static char maximumcharacter(String str){
int maxcount=0;
char result='\0';
    for(int i=0;i<str.length();i++){

        int count=0;

        for(int j=0;j<str.length();j++){

            if(str.charAt(i)==str.charAt(j)){
                count++;
            }

        }

        if(count>maxcount){
            maxcount=count;
            result=str.charAt(i);
        }

    }

    return result;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    System.out.println(maximumcharacter(str));
}
}
