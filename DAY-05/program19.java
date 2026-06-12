import java.util.*;
public class program19{//print factors of a number
    public static void printfactors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " , ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printfactors(n);

    }
}