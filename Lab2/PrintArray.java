import java.util.*;
public class PrintArray {
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
        System.out.println();
        System.out.print("The values are: [");
        for (int index = 0; index < items.length; index++) {
            if (items.length == 0) {
                System.out.print(items[index] + "]");
            } else if (index == items.length - 1) {
                System.out.print(items[index] + "]");
            } else {
                System.out.print(items[index] + ", ");
            }
        }

    }
}
