import java.util.ArrayList;

public class PairSum {
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
        int target = 8;
        System.out.println(pairsum(list, target)); // true
    }

    public static boolean pairsum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(i + " " + j); // 0 3
                    return true;
                }
            }
        }
        return false;

    }
}
