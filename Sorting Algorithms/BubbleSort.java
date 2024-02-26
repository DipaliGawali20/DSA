class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 79, 1 };
        int n = arr.length;
        for (int turn = 0; turn < n; turn++) {
            for (int j = 0; j < n - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}