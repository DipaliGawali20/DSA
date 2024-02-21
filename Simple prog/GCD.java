public class GCD {
    public static void main(String[] args) {
        // Greatest common divisor: Largest intger that divides both numbers without any
        // remainder.
        int n1 = 81;
        int n2 = 153;
        int gcd = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

}

// o/p:9
