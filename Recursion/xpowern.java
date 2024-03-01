//find x to the power n
public class xpowern {
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(power(x, n));

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}// o/p: 1024
