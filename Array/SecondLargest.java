public class Secondlargest {
    public static int secondlargest(int arr[]) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];

            } else if (second_largest < arr[i] && largest != arr[i]) {
                second_largest = arr[i];

            }
        }
        return (second_largest == Integer.MIN_VALUE ? -1 : second_largest);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 3, 5, 6 };

        System.out.println(secondlargest(arr));
    }
}
