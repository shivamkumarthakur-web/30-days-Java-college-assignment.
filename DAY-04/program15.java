import java.util.*;
public class program15{//check armstrong number
    public static void armstrong(int n){
        int temp=n;
        int t=n;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum=sum+(int) Math.pow(digit,count);
            temp=temp/10;
        }
        if(sum==t){
            System.out.println(sum+" is armstrong number.");
        }
        else{
            System.out.println("not an armstrong number.");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        armstrong(n);
    }

}
