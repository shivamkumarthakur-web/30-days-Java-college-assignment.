import java.util.*;
public class program13{//fibonacci 
    public static void printfibonacci(int n){
        if(n==1){
            System.out.println(0);
            return;
        }
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        printfibonacci(n);
    }
}
