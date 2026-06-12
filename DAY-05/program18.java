import java.util.*;
public class program18{//is strong number
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static boolean isstrongnumber(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=factorial(digit);
            n=n/10;
        }
        if(sum!=temp){
            return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isstrongnumber(n));
    }
}