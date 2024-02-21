class ReverseNo {
    public static void main(String[] args) {
        int no = 12345;
        int reversed = 0;
        while (no != 0) {
            int digit = no % 10;// take last no
            reversed = reversed * 10 + digit;// put nos in reversed order
            no /= 10;// remove last digit
        }
        System.out.println(reversed);
    }
}

// o/p: 54321
