import java.util.*;

public class PrintArrayInStars {
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
        for (int index = 0; index < items.length; index++) {
            System.out.print(index + ":");
            for (int starIndex = 0; starIndex < items[index]; starIndex++) {
                System.out.print("*");
            }
            System.out.println("(" + items[index] + ")");
        }
    }
}

