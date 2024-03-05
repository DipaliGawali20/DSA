import java.util.ArrayList;
import java.util.Collections;

public class PairSum2 {
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

        // Sort the list
        Collections.sort(list);

        System.out.println(pairsum2(list, target)); // true
    }

    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int currentSum = list.get(lp) + list.get(rp);
            if (currentSum == target) {
                return true;
            } else if (currentSum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
}
