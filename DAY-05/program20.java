import java.util.*;
public class program20{//print largest prime factor.
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void checklargestpfactor(int n){
        int largest=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            if(n%i==0 && isprime(i)&& i>largest){
                largest=i;
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checklargestpfactor(n);
    }
}