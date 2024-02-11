import java.util.Arrays;

public class KthMinMax {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[arr.length - k]);
    }
}
