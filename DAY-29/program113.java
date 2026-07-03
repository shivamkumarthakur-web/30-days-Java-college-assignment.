import java.util.*;
public class program113{//menu-driven calculator.
public static void calculator(){
Scanner sc=new Scanner(System.in);
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    int choice=sc.nextInt();

    int a=sc.nextInt();
    int b=sc.nextInt();

    switch(choice){

        case 1:
            System.out.println(a+b);
            break;

        case 2:
            System.out.println(a-b);
            break;

        case 3:
            System.out.println(a*b);
            break;

        case 4:
            if(b!=0){
                System.out.println(a/b);
            }
            else{
                System.out.println("Division by zero not possible");
            }
            break;

        default:
            System.out.println("Invalid Choice");
    }

}

public static void main(String args[]){
    calculator();
}
}
