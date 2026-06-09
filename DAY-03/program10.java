import java.util.*;
public class program10{//print primes in a range
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primesinarange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primesinarange(n);
    }
}