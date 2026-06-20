import java.util.*;
public class program45{//function for palindrome.
public static boolean ispalindrome(int n){
int temp=n;
int reverse=0;
    while(n>0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
    }

    if(reverse!=temp){
        return false;
    }
    return true;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(ispalindrome(n));
}

}

