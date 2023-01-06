import java.util.*;

public class ArrayToString {
    public static String arrayToString(int[] array) {
        String output = "";
        for (int idx = 0; idx < array.length; idx++) {
            output += array[idx];
        }
        return output;
    }

    public static void main(String args[]) {
        final int NUM_ITEM;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEM = in.nextInt();
        items = new int[NUM_ITEM];
        System.out.print("Enter the value of all items (separated by space): ");
        if (items.length > 0) {
            for (int index = 0; index < items.length; index++) {
                items[index] = in.nextInt();
            }
        }
        String output = arrayToString(items);
        System.out.print(output);
    }
}
