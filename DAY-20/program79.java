import java.util.*;
public class program79{//find row-wise sum.
public static void rowwisesum(int arr[][]){
    for(int i=0;i<arr.length;i++){

        int sum=0;

        for(int j=0;j<arr[0].length;j++){
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

    rowwisesum(arr);
}
}
