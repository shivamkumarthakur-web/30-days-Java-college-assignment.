import java.util.*;
public class program24{//count x^n without pow(). 
    public static int calculate(int x,int n){
        if(n==1){
            return x;
        }
        int store=1;
        for(int i=1;i<=n;i++){
            store=store*x;
        }
        return store;
    }  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(calculate(x, n));
    }
}
