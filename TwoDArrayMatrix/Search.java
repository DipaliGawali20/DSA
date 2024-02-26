//Search element in an array

package TwoDArrayMatrix;

public class Search {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 },
                           { 4, 5, 6 },
                           { 7, 8, 9 } };
        int key = 5;
        search(matrix, key);
    }

    public static boolean search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;

    }

}
