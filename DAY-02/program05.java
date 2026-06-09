import java.util.*;
public class program05{//sum of digits of a given number
    public static int sumofdigits(int n){
        n=Math.abs(n);
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigits(n));

    }
}
