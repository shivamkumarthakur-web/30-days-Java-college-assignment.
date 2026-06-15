import java.util.*;
public class program32{//print repeated number pattern.
public static void repeatednumberpattern(int n){
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(i);
}
System.out.println();
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    repeatednumberpattern(n);
}
}

