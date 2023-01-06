import java.util.*;

public class Swap {
    public static boolean swap(int array1[], int array2[]) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int index = 0; index < array1.length; index++) {
                int temp = array1[index];
                array1[index] = array2[index];
                array2[index] = temp;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int number = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items of the first array: ");
        int NUM_ITEM1 = in.nextInt();
        int items1[] = new int[NUM_ITEM1];
        System.out.println();
        System.out.print("Enter the items: ");
        if (items1.length > 0) {
            for (int index = 0; index < items1.length; index++) {
                items1[index] = in.nextInt();
            }
        }
        System.out.print("Enter the value of items of the second array: ");
        System.out.println();
        System.out.print("Enter the items: ");
        int NUM_ITEM2 = in.nextInt();
        int items2[] = new int[NUM_ITEM1];
        if (items2.length > 0) {
            for (int index = 0; index < items2.length; index++) {
                items2[index] = in.nextInt();
            }
        }
        if (swap(items1, items2) == true) {
            System.out.print("The first array after swap: ");
            for (int index = 0; index < items1.length; index++) {
                System.out.print(items1[index] + " ");
            }
            System.out.println();
            System.out.print("The second array after swap: ");
            for (int index = 0; index < items2.length; index++) {
                System.out.print(items2[index] + " ");
            }
        } else {
            System.out.print("The two array are not equals to each other");
        }
    }
}
