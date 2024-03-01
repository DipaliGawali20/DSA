//Print Nos from 1 to n

public class Nosfromoneton {
    public static void main(String[] args) {
        int n = 10;
        printDec(n);

    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printDec(n - 1);
        System.out.print(n + " ");
    }
} // o/p: 1 2 3 4 5 6 7 8 9 10
