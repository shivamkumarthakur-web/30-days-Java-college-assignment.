import java.util.*;
public class program22{//binary to decimal.
public static int binarytodecimal(int n){
int decimal=0;
int power=0;
    while(n>0){
        int digit=n%10;
        decimal=decimal+(digit*(int)Math.pow(2,power));
        power++;
        n=n/10;
    }
    return decimal;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(binarytodecimal(n));
}
}

