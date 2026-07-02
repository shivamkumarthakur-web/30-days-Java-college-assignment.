import java.util.*;
public class program95{//find longest word.
public static String longestword(String str){
    String words[]=str.split(" ");
    String longest=words[0];

    for(int i=1;i<words.length;i++){

        if(words[i].length()>longest.length()){
            longest=words[i];
        }

    }

    return longest;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str=sc.nextLine();

    System.out.println(longestword(str));
}
}
