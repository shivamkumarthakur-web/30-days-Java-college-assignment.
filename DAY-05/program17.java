import java.util.*;
public class program17{//check perfect number.
    public static boolean isperfectnumber(int n){
        int check=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                check+=i;
            }
        }
        if(check!=n){
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
