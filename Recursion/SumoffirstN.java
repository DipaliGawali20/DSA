//find sum of first n natural nos

public class SumoffirstN {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));

    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sumofn = n + sum(n - 1);
        return sumofn;
    }
} // o/p: 55
