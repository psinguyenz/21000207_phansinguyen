import java.util.*;

public class Contains {
    public static boolean contains(int array[], int key) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int number = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int NUM_ITEM = in.nextInt();
        int items[] = new int[NUM_ITEM];
        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
            for (int index = 0; index < items.length; index++) {
                items[index] = in.nextInt();
            }
        }
        System.out.print("Enter the key: ");
        int key = in.nextInt();
        if (contains(items, key) == true) {
            System.out.println("The array contains the key value");
        } else {
            System.out.println("The array doesn't contains the key value");
        }
    }
}
