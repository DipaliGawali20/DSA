public class PalindromeString {
    public static void main(String[] args) {
        String s = "level";
        int len = s.length();
        boolean isPalindrome = true;

        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                isPalindrome = false;
                break; // exit the loop early since we already know it's not a palindrome
            }
        }

        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
// o/p:true
