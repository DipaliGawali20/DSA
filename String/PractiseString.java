import java.util.*;

public class PractiseString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "Dipali";
        String d = "Dipali";

        System.out.println(s);
        // String a = new String();
        // a = sc.nextLine();
        // System.out.println("Your name is " + a);
        // // length
        // System.out.println(s.length());
        // for (int i = 0; i < s.length(); i++) {
        // System.out.println(i);

        // }
        if (s.compareTo(d) == 0) {
            System.out.println("equal");
        } else if (s.compareTo(d) >= Integer.MIN_VALUE && s.compareTo(d) < 0) {
            System.out.println("Negative no");
        } else {
            System.out.println("not equal");
        }

    }

}
