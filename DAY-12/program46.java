import java.util.*;
public class program46{//function for armstrong.
public static boolean isarmstrong(int n){
int temp=n;
int sum=0;
    while(n>0){
        int digit=n%10;
        sum=sum+(digit*digit*digit);
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
    System.out.println(isarmstrong(n));
}
}
