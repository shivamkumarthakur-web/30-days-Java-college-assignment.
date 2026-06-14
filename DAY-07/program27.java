import java.util.*;
public class program27{//recursive sum of digits.
public static int sumofdigits(int n){
if(n==0){
return 0;
}
return (n%10)+sumofdigits(n/10);
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(sumofdigits(n));
}

}
