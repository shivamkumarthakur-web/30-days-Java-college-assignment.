import java.util.*;
public class program65{//merge arrays.
public static void mergearrays(int arr1[],int arr2[]){
int merge[]=new int[arr1.length+arr2.length];
    int index=0;

    for(int i=0;i<arr1.length;i++){
        merge[index]=arr1[i];
        index++;
    }

    for(int i=0;i<arr2.length;i++){
        merge[index]=arr2[i];
        index++;
    }

    for(int i=0;i<merge.length;i++){
        System.out.print(merge[i]+" ");
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n1=sc.nextInt();
    int arr1[]=new int[n1];

    for(int i=0;i<n1;i++){
        arr1[i]=sc.nextInt();
    }

    int n2=sc.nextInt();
    int arr2[]=new int[n2];

    for(int i=0;i<n2;i++){
        arr2[i]=sc.nextInt();
    }

    mergearrays(arr1,arr2);
}
}
