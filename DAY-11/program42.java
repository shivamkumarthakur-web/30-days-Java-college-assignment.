import java.util.*;
public class program42{//function to find maximum.
public static int maximum(int a,int b){
if(a>b){
return a;
}
return b;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println(maximum(a,b));
}
}
