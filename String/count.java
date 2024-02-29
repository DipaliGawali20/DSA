public class count {
    public static void main(String[] args) {
        int vowels = 0, Consonant = 0, whitespace = 0;
        String s = "he llo";
        int length = s.length();
        s = s.toLowerCase();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;

            } else if (ch >= 'a' && ch <= 'z') {
                Consonant++;
            } else if (ch == ' ') {
                whitespace++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + Consonant);
        System.out.println("Whitespace: " + whitespace);

    }
}

// O/P
// Vowels: 2
// Consonant: 3
// Whitespace: 1
