import java.util.*;
public class program21{//decimal to binary.
public static int decimaltobinary(int n){
int binary=0;
int place=1;
    while(n>0){
        int rem=n%2;
        binary=binary+(rem*place);
        place=place*10;
        n=n/2;
    }
    return binary;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(decimaltobinary(n));
}

}

    