import java.util.*;

public class program16 { // print Armstrong numbers in a range

    public static boolean isArmstrong(int n) {

        int original = n;
        int count = 0;
        int temp = n;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, count);
            temp = temp / 10;
        }

        return sum == original;
    }

    public static void printArmstrongInRange(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        printArmstrongInRange(start, end);
    }
}