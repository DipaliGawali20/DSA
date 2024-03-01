//Find the Last occurence of an element in an array

public class LastOccuurence {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 5 };

        System.out.println(firstocc(arr, 5, arr.length - 1));
    }

    public static int firstocc(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstocc(arr, key, i - 1);
    }
}// o/p: 5