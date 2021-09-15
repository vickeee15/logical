
import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (i = 2; i < num / 2; i++) {
            if (num % i == 0)
                System.out.println("not prime");
            else
                System.out.println("prime number");}
    }
}