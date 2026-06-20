import java.util.*;
public class program52{//count even and odd elements.
public static void countevenandodd(int arr[]){
int even=0;
int odd=0;
    for(int i=0;i<arr.length;i++){

        if(arr[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }

    System.out.println("Even = "+even);
    System.out.println("Odd = "+odd);
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    countevenandodd(arr);
}
}
