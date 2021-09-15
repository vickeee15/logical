import java.util.Scanner;

public class reverse {
    public static void main(String args[]) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rem, reverse = 0;
        while (a != 0) {
            rem = a % 10;

            reverse = reverse * 10 + rem;
            a = a / 10;
        }
        System.out.println("The reverse:" + reverse);
    }
}
