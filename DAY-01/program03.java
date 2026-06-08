import java.util.*;
public class program03{//factorial
    public static long factorial(int n){
        long f=1;
        for(int i=2;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));

    }
}