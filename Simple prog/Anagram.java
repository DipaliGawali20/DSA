//Anagram of a string is a string that contains the same characters , only the order of characters can be different.
//e.g S1-> LISTEN  S2-> SILENT

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String S1 = "LISTEN";
        String S2 = "SILENT";
        char c1[] = S1.toCharArray();
        char c2[] = S2.toCharArray();
        if (c1.length != c2.length) {
            System.out.println("Not Anagram");
            System.exit(0);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("Not Anagram");
                System.exit(0);
            }
        }
        System.out.println("Anagram ");
    }
}
