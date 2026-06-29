import java.util.*;
public class program82{//reverse a string.
public static void reversestring(String str){
for(int i=str.length()-1;i>=0;i--){
System.out.print(str.charAt(i));
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    reversestring(str);
}
}
