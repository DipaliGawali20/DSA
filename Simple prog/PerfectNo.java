import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Positive integer that is equal to the sum of its proper divisors
        int no = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < no; i++) {
            if (no % i == 0) {
                sum += i;
            }
        }
        if (sum == no) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not Perfect number");
        }
    }
}
// o/p:
// 6
// Perfect number