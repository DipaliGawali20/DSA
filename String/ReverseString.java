public class ReverseString {
    public static void main(String[] args) {

        // // 1 st way

        // StringBuilder sb = new StringBuilder("hello");
        // int len = sb.length();
        // for (int i = 0; i < len / 2; i++) {
        // int front = i;
        // int back = sb.length() - 1 - i;
        // char frontChar = sb.charAt(front);
        // char backChar = sb.charAt(back);
        // sb.setCharAt(front, backChar);
        // sb.setCharAt(back, frontChar);

        // }
        // System.out.println(sb); // olleh

        /*
         * // 2 nd way
         * String name = "Hello";
         * int n = name.length();
         * String rev = "";
         * for (int i = n - 1; i >= 0; i--) {
         * rev = rev + name.charAt(i);
         * }
         * System.out.println(rev); //olleH
         */

        // 3 rd way
        String name = "Hello";
        int n = name.length();
        // convert string to charArray
        char[] arr1 = name.toCharArray();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr1[i]); // olleH
        }

    }
}
