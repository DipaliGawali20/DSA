import java.util.ArrayList;

public class MaxNo {
    public static void main(String[] args) {
        // creation
        ArrayList<Integer> list = new ArrayList<>();
        // insert
        list.add(1);
        list.add(2);
        list.add(3);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum No." + max); // Maximum No.3
    }
}
