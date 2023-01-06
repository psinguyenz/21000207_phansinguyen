import java.util.*;

public class GradeStatistics2 {
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
        double avg = (double) sum / items.length;
        double std = 0.0;
        int len = items.length;
        double mean = (double)sum/len;
        for(double num: items) {
            std += Math.pow(num - mean, 2);
        }
        std = Math.sqrt(std/len);
        System.out.print("The grades are: [");
        for (int index = 0; index < items.length; index++) {
            if (index == items.length-1) {
                System.out.print(items[index]);
            }
            else {
                System.out.print(items[index] + ",");
            }
        }
        Arrays.sort(items);
        double median = 0.0;
        if(len%2==1)
        {
            median=items[(len+1)/2-1];
        }
        else
        {
            median=(items[len/2-1]+items[len/2])/2;
        }
        System.out.println("]");
        System.out.printf("The average is: %.2f", avg);
        System.out.println();
        System.out.println("The median is: " + median);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        System.out.printf("The standard deviation is: %.2f", std);
    }
}
