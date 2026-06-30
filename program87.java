import java.util.*;
public class program87{//character frequency.
public static int frequency(String str,char key){
int count=0;
    for(int i=0;i<str.length();i++){

        if(str.charAt(i)==key){
            count++;
        }

    }

    return count;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();
    char key=sc.next().charAt(0);

    System.out.println(frequency(str,key));
}
}
