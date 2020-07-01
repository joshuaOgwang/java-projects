import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        // creating Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // the index of first character of the string
        int low = 0;

        // the index of thhe last characters in the string
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if (isPalindrome) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + "is not a palindrome");
        }

        input.close();
    }
}