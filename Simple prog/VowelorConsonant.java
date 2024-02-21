public class VowelorConsonant {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");

        } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("Consonant");
        } else {
            System.out.println("Not Alphabet");
        }
    }
}
// o/p:
// Vowel
