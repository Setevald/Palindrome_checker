import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String Input = scanner.nextLine();

        if (isPalindrome(Input, 0, Input.length() -1)) {
            System.out.println(Input + " is a palindrome.");
        } else {
            System.out.println(Input + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str, int start, int end) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        if (start >= end) {
            return true;  
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false; 
        }

        return isPalindrome(str, start + 1, end - 1);
    }
}
