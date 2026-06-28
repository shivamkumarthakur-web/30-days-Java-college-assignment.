import java.util.*;
public class program74{//subtract matrices.
public static void subtractmatrices(int arr1[][],int arr2[][]){
int difference[][]=new int[arr1.length][arr1[0].length];
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[0].length;j++){
            difference[i][j]=arr1[i][j]-arr2[i][j];
        }
    }

    for(int i=0;i<difference.length;i++){
        for(int j=0;j<difference[0].length;j++){
            System.out.print(difference[i][j]+" ");
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

    subtractmatrices(arr1,arr2);
}
}
