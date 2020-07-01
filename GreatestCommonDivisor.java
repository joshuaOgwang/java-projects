import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int gcd = 1; // initial greatest common divisor
        int k = 2; // possible greatest common divisor

        // prompt user to enter test numbers
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scan.nextInt();

        // Find the greatest common divisor
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.println("The Greatest Common Divisor is " + gcd);

        scan.close();
    }
}