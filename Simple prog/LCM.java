public class LCM {
    public static void main(String[] args) {
        int gcd = 0;
        int n1 = 72;
        int n2 = 120;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (n1 * n2) / gcd;
        System.out.println(lcm);
    }
}
// o/p: 360
