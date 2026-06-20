import java.util.*;
public class program48{//function for perfect number.
public static boolean isperfectnumber(int n){
int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;
        }
    }

    if(sum!=n){
        return false;
    }
    return true;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(isperfectnumber(n));
}
}

