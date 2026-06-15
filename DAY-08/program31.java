import java.util.*;
public class program31{//print character triangle.
public static void charactertriangle(int n){
for(int i=1;i<=n;i++){
for(char ch='A';ch<'A'+i;ch++){
System.out.print(ch);
}
System.out.println();
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    charactertriangle(n);
}

}

