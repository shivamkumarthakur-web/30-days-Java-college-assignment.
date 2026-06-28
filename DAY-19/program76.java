import java.util.*;
public class program76{//find diagonal sum.
public static int diagonalsum(int arr[][]){
int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i][i];
    }

    return sum;
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

    System.out.println(diagonalsum(arr));
}
}
