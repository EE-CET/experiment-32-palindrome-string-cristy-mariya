import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // Convert to lowercase for case-insensitive check
        str = str.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output
        if (isPalindrome) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
