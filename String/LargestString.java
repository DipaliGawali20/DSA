public class LargestString {
    public static String largestStringg(String fruits[]) {
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;

    }

    public static void main(String args[]) {
        String fruits[] = { "Apple", "Banana", "Mango" }; // lexicographically
        System.out.println(largestStringg(fruits));
    }
}
