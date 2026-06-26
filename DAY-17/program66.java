import java.util.*;
public class program66{//union of arrays.
public static void unionofarrays(int arr1[],int arr2[]){
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
    }

    for(int i=0;i<arr2.length;i++){

        boolean found=false;

        for(int j=0;j<arr1.length;j++){
            if(arr2[i]==arr1[j]){
                found=true;
                break;
            }
        }

        if(!found){
            System.out.print(arr2[i]+" ");
        }

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

    unionofarrays(arr1,arr2);
}
}
