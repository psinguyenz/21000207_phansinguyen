import java.util.*;

public class Reverse {
    public static void reverse(int array[]) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            int temp = array[bIdx];
            array[bIdx] = array[fIdx];
            array[fIdx] = temp;
        }
    }

    public static void main(String args[]) {
        int number = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items of the array: ");
        int NUM_ITEM = in.nextInt();
        int items[] = new int[NUM_ITEM];
        System.out.print("Enter the items: ");
        if (items.length > 0) {
            for (int index = 0; index < items.length; index++) {
                items[index] = in.nextInt();
            }
        }
        reverse(items);
        System.out.print("The reversed array: ");
        for (int index = 0; index < items.length; index++) {
            System.out.print(items[index] + " ");
        }
    }
}
