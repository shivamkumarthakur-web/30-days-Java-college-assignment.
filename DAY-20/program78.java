import java.util.*;
public class program78{//check symmetric matrix.
public static boolean issymmetric(int arr[][]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){

            if(arr[i][j]!=arr[j][i]){
                return false;
            }

        }
    }

    return true;
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

    System.out.println(issymmetric(arr));
}
}
