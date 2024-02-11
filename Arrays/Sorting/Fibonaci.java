public class Fibonaci {
    public static int fiboiterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;

        }
        return b;

    }

    public static int fiborecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fiborecursive(n - 1) + fiborecursive(n - 2);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(fiboiterative(n));
        System.out.println(fiborecursive(n));

    }
}
