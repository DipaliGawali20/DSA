//Find the first occurence of an element in an array

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8 };

        System.out.println(firstocc(arr, 5, 0));
    }

    public static int firstocc(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstocc(arr, key, i + 1);
    }
}// o/p: 2
