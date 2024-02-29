import java.util.Scanner;

public class StringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String s = new String("abcd");
        String name;
        name = sc.nextLine(); // hello
        System.out.println(name); // hello
        // Length of String
        System.out.println(name.length()); // 5

        // String Concatenation
        String fname = "Hello";
        String lname = "world..!";
        String fullname = fname + " " + lname;
        System.out.println(fullname); // Hello world..!

        // charAt Function
        System.out.println(name.charAt(0)); // h

        // == & equals function
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        if (s1.equals(s3)) {
            System.out.println("Equal"); // equal
        } else {
            System.out.println("Not Equal");
        }

        // substring
        System.out.println(s1.substring(0, 2)); // he

        String substr = "";
        for (int i = 0; i < 2; i++) {
            substr += s1.charAt(i);
        }
        System.out.println(substr); // he

        // print largest string
        String fruits[] = { "apple", "banana", "mango" };
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest); // mango

    }
}
