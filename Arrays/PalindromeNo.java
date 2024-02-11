public class PalindromeNo {
    public static void main(String args[]) {
        int x = 121;
        palindrome(x);

    }

    public static boolean palindrome(int x) {
        String s = String.valueOf(x);  //convert no to string
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
