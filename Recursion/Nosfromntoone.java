//Print nos from n to 1

class Nosfromntoone {
    public static void main(String[] args) {
        int n = 10;
        printDec(n);

    }

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }
}
// o/p: 10 9 8 7 6 5 4 3 2 1