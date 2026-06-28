import java.util.*;
public class program75{//transpose matrix.
public static void transposematrix(int arr[][]){
int transpose[][]=new int[arr[0].length][arr.length];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            transpose[j][i]=arr[i][j];
        }
    }

    for(int i=0;i<transpose.length;i++){
        for(int j=0;j<transpose[0].length;j++){
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
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

    transposematrix(arr);
}
}
