package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 7, 56, 34, 78, 2, 4, 90 };
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
