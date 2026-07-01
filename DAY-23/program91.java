import java.util.*;
public class program91{//check anagram strings.
public static boolean isanagram(String str1,String str2){
    if(str1.length()!=str2.length()){
        return false;
    }

    char arr1[]=str1.toCharArray();
    char arr2[]=str2.toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for(int i=0;i<arr1.length;i++){

        if(arr1[i]!=arr2[i]){
            return false;
        }

    }

    return true;
}

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    String str1=sc.nextLine();
    String str2=sc.nextLine();

    System.out.println(isanagram(str1,str2));
}
}
