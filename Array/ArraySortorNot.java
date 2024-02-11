//Check if an array is Sorted

public class ArraySortorNot {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 8, 5, 6 };
        int n = arr.length;
        boolean b = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                b = false;
                break; // Exit the loop as soon as an unsorted pair is found
            }
        }

        if (b) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
