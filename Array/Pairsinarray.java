package Arrays;

public class Pairsinarray {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 6, 7, 8, 65 };
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }
}
