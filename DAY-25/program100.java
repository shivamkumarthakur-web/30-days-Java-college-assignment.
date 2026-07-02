import java.util.*;
public class program100{//sort words by length.
public static void sortwords(String arr[]){
    for(int i=0;i<arr.length-1;i++){

        for(int j=0;j<arr.length-1-i;j++){

            if(arr[j].length()>arr[j+1].length()){
                String temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }

    }

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

    sortwords(arr);
}
}
