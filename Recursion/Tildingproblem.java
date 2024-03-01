public class Tildingproblem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(problem(n));
    }

    public static int problem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = problem(n - 1);
        int fnm2 = problem(n - 2);
        int totways = fnm1 + fnm2;
        return totways;
    }
}// o/p: 3
