import java.util.*;
public class program80{//find column-wise sum.
public static void columnwisesum(int arr[][]){
    for(int j=0;j<arr[0].length;j++){

        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i][j];
        }

        System.out.println(sum);
    }

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int rows=sc.nextInt();
    int cols=sc.nextInt();

    int arr[][]=new int[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    columnwisesum(arr);
}
}
