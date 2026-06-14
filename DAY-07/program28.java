import java.util.*;
public class program28{//recursive reverse number.
static int reverse=0;

public static int reversenumber(int n){
    if(n==0){
        return reverse;
    }

    reverse=reverse*10+(n%10);
    return reversenumber(n/10);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(reversenumber(n));
}
}

