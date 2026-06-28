import java.util.*;
public class program77{//multiply matrices.
public static void multiplymatrices(int arr1[][],int arr2[][]){
int multiply[][]=new int[arr1.length][arr2[0].length];
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2[0].length;j++){
            for(int k=0;k<arr1[0].length;k++){
                multiply[i][j]+=arr1[i][k]*arr2[k][j];
            }
        }
    }

    for(int i=0;i<multiply.length;i++){
        for(int j=0;j<multiply[0].length;j++){
            System.out.print(multiply[i][j]+" ");
        }
        System.out.println();
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int rows1=sc.nextInt();
    int cols1=sc.nextInt();

    int arr1[][]=new int[rows1][cols1];

    for(int i=0;i<rows1;i++){
        for(int j=0;j<cols1;j++){
            arr1[i][j]=sc.nextInt();
        }
    }

    int rows2=sc.nextInt();
    int cols2=sc.nextInt();

    int arr2[][]=new int[rows2][cols2];

    for(int i=0;i<rows2;i++){
        for(int j=0;j<cols2;j++){
            arr2[i][j]=sc.nextInt();
        }
    }

    multiplymatrices(arr1,arr2);
}
}
