import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // insert
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(2);
        list.add(4);
        System.out.println(list);
        int idx1 = 1;
        int idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}

// o/p:
// [1, 5, 9, 7, 2, 4]
// [1, 7, 9, 5, 2, 4]
