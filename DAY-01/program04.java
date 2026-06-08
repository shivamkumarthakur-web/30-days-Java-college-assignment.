import java.util.*;
public class program04{//count digits in a number.
    public static int countdigits(int n){
        if(n==0){
            return 1;
        }
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countdigits(n));

    }
}
