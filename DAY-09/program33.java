import java.util.*;
public class program33{//print reverse star pattern.
public static void reversestarpattern(int n){
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    reversestarpattern(n);
}
}

