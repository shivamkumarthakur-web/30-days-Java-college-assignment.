import java.util.*;
public class program61{//find missing number in array.
public static int findmissingnumber(int arr[]){
int n=arr.length+1;
    int totalsum=(n*(n+1))/2;
    int arraysum=0;

    for(int i=0;i<arr.length;i++){
        arraysum+=arr[i];
    }

    return totalsum-arraysum;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    System.out.println(findmissingnumber(arr));
}
}
