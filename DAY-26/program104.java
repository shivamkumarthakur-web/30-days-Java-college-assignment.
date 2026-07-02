import java.util.*;
public class program104{//quiz application.
public static void quiz(){
Scanner sc=new Scanner(System.in);
    int score=0;

    System.out.println("Capital of India?");
    System.out.println("1. Delhi");
    System.out.println("2. Mumbai");
    System.out.println("3. Chennai");
    System.out.println("4. Kolkata");

    int ans1=sc.nextInt();

    if(ans1==1){
        score++;
    }

    System.out.println("5 + 7 = ?");
    System.out.println("1. 10");
    System.out.println("2. 11");
    System.out.println("3. 12");
    System.out.println("4. 13");

    int ans2=sc.nextInt();

    if(ans2==3){
        score++;
    }

    System.out.println("Score = "+score);
}

public static void main(String args[]){
    quiz();
}
}
