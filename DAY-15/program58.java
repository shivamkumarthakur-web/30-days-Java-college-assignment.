import java.util.*;
public class program58{//rotate array left.
public static void rotateleft(int arr[]){
int first=arr[0];
    for(int i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];
    }

    arr[arr.length-1]=first;

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    rotateleft(arr);
}
}
