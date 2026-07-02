import java.util.*;
public class program102{//voting eligibility system.
public static boolean eligible(int age){
    if(age>=18){
        return true;
    }

    return false;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int age=sc.nextInt();

    System.out.println(eligible(age));
}
}
