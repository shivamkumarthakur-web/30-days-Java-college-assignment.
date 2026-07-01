import java.util.*;
public class program90{//find first repeating character.
public static char firstrepeating(String str){
    for(int i=0;i<str.length();i++){

        for(int j=i+1;j<str.length();j++){

            if(str.charAt(i)==str.charAt(j)){
                return str.charAt(i);
            }

        }

    }

    return '\0';
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    System.out.println(firstrepeating(str));
}
}
