import java.util.*;
public class program07{//product of digits
    public static int prodofdigits(int n){
        n=Math.abs(n);
        int prod=1;
        while(n>0){
            int p=n%10;
            prod=prod*p;
            n=n/10;
        }
        return prod;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(prodofdigits(n));
    }
}
