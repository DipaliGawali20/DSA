//Largest Element in an array
package Arrays;

public class LargestElement {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 12, 8 };
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Larrgest Element in an array is: " + largest);

    }

}
