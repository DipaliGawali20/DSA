//Print nth fibonacci number

public class Nthfibono {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fiboofn(n));

    }

    public static int fiboofn(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fn1 = fiboofn(n - 1);
        int fn2 = fiboofn(n - 2);
        int fn = fn1 + fn2;
        return fn;
    }
}
// o/p: 55