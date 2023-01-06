import java.util.*;

public class GradeStatistics {
    public static void main(String args[]) {
        final int NUM_ITEM;
        int[] items;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        NUM_ITEM = in.nextInt();
        items = new int[NUM_ITEM];
        int sum = 0;
        for (int index = 0; index < items.length; index++) {
            System.out.print("Enter the grade for student " + (index + 1) + " : ");
            items[index] = in.nextInt();
            sum += items[index];
        }
        int min = items[0];
        int max = items[0];
        for (int index = 1; index < items.length; index++) {
            if (min > items[index]) {
                min = items[index];
            }
        }
        for (int index = 1; index < items.length; index++) {
            if (max < items[index]) {
                max = items[index];
            }
        }
        System.out.println();
        double avg = (double) sum / items.length;
        System.out.printf("The average is: %.2f", avg);
        System.out.println();
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
