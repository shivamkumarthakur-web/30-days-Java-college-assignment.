import java.util.*;
public class program73{//add matrices.
public static void addmatrices(int arr1[][],int arr2[][]){
int sum[][]=new int[arr1.length][arr1[0].length];
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[0].length;j++){
            sum[i][j]=arr1[i][j]+arr2[i][j];
        }
    }

    for(int i=0;i<sum.length;i++){
        for(int j=0;j<sum[0].length;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int rows=sc.nextInt();
    int cols=sc.nextInt();

    int arr1[][]=new int[rows][cols];
    int arr2[][]=new int[rows][cols];

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr1[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr2[i][j]=sc.nextInt();
        }
    }

    addmatrices(arr1,arr2);
}
}
