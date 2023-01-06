import java.util.*;

public class InsertionSort {
    static Scanner sc = new Scanner(System.in);
    public static int[] inputArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        printArray(array);
    }

    public static void main(String[] args) {
        System.out.println("Enter lenth of array : ");
        int n = sc.nextInt();
        System.out.println("Enter all the elements of the array : ");
        int[] array = inputArray(n);
        insertionSort(array);
    }
}