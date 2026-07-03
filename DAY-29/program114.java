import java.util.*;
public class program114{//menu-driven array operations.
public static void arrayoperations(){
Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    System.out.println("1. Display");
    System.out.println("2. Sum");

    int choice=sc.nextInt();

    switch(choice){

        case 1:
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            break;

        case 2:
            int sum=0;

            for(int i=0;i<n;i++){
                sum=sum+arr[i];
            }

            System.out.println(sum);
            break;

        default:
            System.out.println("Invalid Choice");

    }

}

public static void main(String args[]){
    arrayoperations();
}
}
