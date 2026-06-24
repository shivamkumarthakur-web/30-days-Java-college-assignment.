import java.util.*;
public class program62{//find maximum frequency element.
public static int maximumfrequencyelement(int arr[]){
int maxfrequency=0;
int element=arr[0];
    for(int i=0;i<arr.length;i++){

        int count=0;

        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }

        if(count>maxfrequency){
            maxfrequency=count;
            element=arr[i];
        }
    }

    return element;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    System.out.println(maximumfrequencyelement(arr));
}
}
