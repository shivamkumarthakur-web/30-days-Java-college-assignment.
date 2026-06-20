import java.util.*;
public class program50{//find sum and average of array.
public static void sumandaverage(int arr[]){
int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }

    double average=(double)sum/arr.length;

    System.out.println("Sum = "+sum);
    System.out.println("Average = "+average);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    sumandaverage(arr);
}
}
