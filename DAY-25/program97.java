import java.util.*;
public class program97{//merge two sorted arrays.
public static void mergearrays(int arr1[],int arr2[]){
int merge[]=new int[arr1.length+arr2.length];
    int i=0;
    int j=0;
    int k=0;

    while(i<arr1.length && j<arr2.length){

        if(arr1[i]<arr2[j]){
            merge[k]=arr1[i];
            i++;
        }
        else{
            merge[k]=arr2[j];
            j++;
        }

        k++;
    }

    while(i<arr1.length){
        merge[k]=arr1[i];
        i++;
        k++;
    }

    while(j<arr2.length){
        merge[k]=arr2[j];
        j++;
        k++;
    }

    for(i=0;i<merge.length;i++){
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
