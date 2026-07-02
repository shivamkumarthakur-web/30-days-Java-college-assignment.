import java.util.*;
public class program101{//number guessing game.
public static void game(){
Scanner sc=new Scanner(System.in);
Random rand=new Random();
    int number=rand.nextInt(100)+1;
    int guess=0;

    while(guess!=number){

        guess=sc.nextInt();

        if(guess>number){
            System.out.println("Too High");
        }
        else if(guess<number){
            System.out.println("Too Low");
        }
        else{
            System.out.println("Correct Guess");
        }

    }

}

public static void main(String args[]){
    game();
}
}
