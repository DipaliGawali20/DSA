import java.util.Scanner;

class ArrayBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        // marks[0] = 90;
        // marks[1] = 96;
        // marks[2] = 93;
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in an array :");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}