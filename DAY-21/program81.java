import java.util.*;
public class program81{//find string length without strlen().
public static int findlength(String str){
char arr[]=str.toCharArray();
int count=0;
    for(int i=0;i<arr.length;i++){
        count++;
    }

    return count;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    System.out.println(findlength(str));
}
}
