import java.util.*;
public class program06{//reverse a number
    public static int reversednumber(int n){
        n=Math.abs(n);
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reversednumber(n));
    }
}
