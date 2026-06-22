import java.util.*;
public class program54{//frequency of an element.
public static int frequency(int arr[],int key){
int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            count++;
        }
    }

    return count;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int key=sc.nextInt();

    System.out.println(frequency(arr,key));
}
}

