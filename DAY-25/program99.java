import java.util.*;
public class program99{//sort names alphabetically.
public static void sortnames(String arr[]){
    Arrays.sort(arr);

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    sc.nextLine();

    String arr[]=new String[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextLine();
    }

    sortnames(arr);
}
}
