//Check Array Sorted or Not

public class ArraySortorNot {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8 };
        int i = 2; // i is from where we have to start comparison
        System.out.println(sort(arr, i));

    }

    public static boolean sort(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sort(arr, i + 1);

    }
}
// o/p: true
