import java.util.Scanner;

public class countDIgits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int original_n = n ;
        int numOfDigits = 0;

        while (n > 0) {
            n = n / 10;
            numOfDigits++;
        }
        System.out.println("The number of Digits in " + original_n + " is = " +numOfDigits);
    }
}
