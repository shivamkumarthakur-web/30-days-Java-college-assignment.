import java.util.*;
public class program08{//check palindrome
    public static boolean palindrome(int n){
        n=Math.abs(n);
        int temp=n;
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(palindrome(n));

    }
}
