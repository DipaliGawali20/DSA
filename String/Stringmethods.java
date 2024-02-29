public class Stringmethods {
    public static void main(String args[]) {
        String s1 = "GeeksforGeeks";
        String s2 = "Hii";
        System.out.println(s1.length()); // length
        System.out.println(s1.charAt(3)); // find char by position
        System.out.println(s1.substring(4, 6)); // i to j-1 of end index not given then returns the string upto the last
                                                // character
        System.out.println(s1.concat(s2)); // Concatenation
        // indexOf("String") Returns the index
        // of the first occurrence of the specified string.
        System.out.println(s1.indexOf("for"));

        // compareTo: if s1<s2 then returns negative
        // if s1>s2 then returns positive value
        // if s1=s2 then returns 0
        // These are compared on the basis of the ascii value i.e 1st char of s1 compare
        // with the 1st char of s2 like these in similar way

        System.out.println(s1.compareTo(s2));

        // Checking equality: If equal=true
        // else false
        System.out.println(s1.equals(s2));

        // Cases
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        // Trimming: Returns the copy of the String,
        // by removing whitespaces at both ends. It does not affect whitespaces in the
        // middle.
        String s = " dipali ";
        System.out.println(s.trim());

        // Replacing characters
        String a1 = "Geeks";
        String a2 = "feeks";
        System.out.println(a1.replace("G", "f"));
        // System.out.println(a1.substring(0, 2));
    }

}

// O/P

// 13
// k
// sf
// GeeksforGeeksHii
// 5
// -1
// false
// GEEKSFORGEEKS
// hii
// dipali
// feeks