import java.util.*;
public class program85{//check palindrome string.
public static boolean ispalindrome(String str){
int start=0;
int end=str.length()-1;
    while(start<end){

        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }

        start++;
        end--;
    }

    return true;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    System.out.println(ispalindrome(str));
}
}
