public class PalindromeNo {
    public static void main(String[] args) {
        int no = 464;
        int temp = no;
        int reversed = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (reversed == no) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}

// o/p: Palindrome
