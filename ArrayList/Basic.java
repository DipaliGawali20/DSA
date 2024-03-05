import java.util.ArrayList;

class Basic {
    public static void main(String[] args) {
        // creation
        ArrayList<Integer> list = new ArrayList<>();
        // insert
        list.add(1);
        list.add(2);
        list.add(3);
        // size
        System.out.println(list.size()); // 3

        // print Arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // 1 2 3
        }
        System.out.println();
        // Reverse of an ArrayList
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " "); // 3 2 1
        }

    }
}