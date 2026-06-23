import java.util.*;
public class program60{//move zeroes to end.
public static void movezeroestoend(int arr[]){
int index=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[index]=arr[i];
            index++;
        }
    }

    while(index<arr.length){
        arr[index]=0;
        index++;
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    movezeroestoend(arr);
}
}

