import java.util.*;
public class program23{//count set bits in a number.
public static int countsetbits(int n){
int count=0;
    while(n>0){
        int rem=n%2;

        if(rem==1){
            count++;
        }

        n=n/2;
    }

    return count;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(countsetbits(n));
}
}

