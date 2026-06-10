import java.util.*;
public class program14{//nth fibonacci term
    public static int nthfiboterm(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int a=0;int b=1;
        int next=0;
        for(int i=3;i<=n;i++){
            next=a+b;
            a=b;
            b=next;
        }
        return next;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(nthfiboterm(n));
    }
}