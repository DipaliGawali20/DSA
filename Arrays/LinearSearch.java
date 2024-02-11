import java.security.Key;

public class LinearSearch {
    public static int linearsearch(int marks[], int key) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int marks[] = { 1, 2, 3, 4 };
        int key = 1;
        int index = linearsearch(marks, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is at index :" + index);
        }

    }

}
