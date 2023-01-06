import java.util.*;

public class CopyOf {
    public static int[] copyOf(int array[]) {
        int copy[] = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            copy[index] = array[index];
        }
        return copy;
    }
    public static int[] copyOf2(int array[], int NUM_COPY) {
        int copy2[] = new int[NUM_COPY];
        for (int index = 0; index < array.length; index++) {
            copy2[index] = array[index];
        }
        for (int index2 = array.length+1; index2 < NUM_COPY; index2++) {
            copy2[index2] = 0;
        }
        return copy2;
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
        System.out.print("Enter the number of items of the second copy: ");
        int NUM_COPY = in.nextInt();
        int copy[] = copyOf(items);
        System.out.print("The copy of the array: ");
        for (int index = 0; index < items.length; index++) {
            System.out.print(copy[index] + " ");
        }
        System.out.println();
        int copy2[] = copyOf2(items, NUM_COPY);
        System.out.print("The second copy of the array: ");
        for (int index = 0; index < copy2.length; index++) {
            System.out.print(copy2[index] + " ");
        }
    }
}
