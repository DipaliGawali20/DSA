//Factorial of a number

public class Factorialofno {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(n));

    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * fact(n - 1);
        return fn;
    }
} // o/p: 3628800
