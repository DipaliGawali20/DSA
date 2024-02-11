public class IsArraySorted {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 5, 6, 7, 8, 9 };

        System.out.println(sorted(arr));
    }

    public static boolean sorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
