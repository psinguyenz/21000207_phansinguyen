package com.sortstrategy;
import java.util.*;

public class App {
    public static void main(String[] args) {
        /* TODO */
        // Tạo một mảng các số tự nhiên, các số tự nhiên được sinh ngẫu nhiên
        int[] array = new int[5];
        for(int i = 0; i<array.length; i++) {
            Random rand = new Random();
            int randomInt = rand.nextInt(100);
            array[i] = randomInt;
        }

        // In ra mảng vừa tạo theo định dạng, ví dụ [1 2 3 4 5].
        System.out.print("[");
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        // Sắp xếp mảng theo thứ tự tăng dần sử dụng các thuật toán sắp xếp khác nhau.
        // In ra mảng sau khi sắp xếp.
        // In ra số lần đổi vị trí trong thuật toán đang sử dụng.
        // Ví dụ:

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.print("Before sorting: [");
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        // Using Bubble Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        BubbleSort BBsort = new BubbleSort();
        int swap = BBsort.sort(array);
        // After sorting: [1 2 3 4 5]
        System.out.print("After sorting: [");
        for(int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        // Number of swap: 10
        System.out.println("Number of swap: " + swap);


        // Using Selection Sort Algorithm:
        int[] array2 = new int[5];
        for(int i = 0; i<array2.length; i++) {
            Random rand = new Random();
            int randomInt = rand.nextInt(100);
            array2[i] = randomInt;
        }
        System.out.println("Using Selection Sort Algorithm:");
        System.out.print("Before sorting: [");
        for(int i = 0; i<array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");
        SelectionSort Ssort = new SelectionSort();
        int swap2 = Ssort.sort(array2);
        System.out.print("After sorting: [");
        for(int i = 0; i<array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");
        // Number of swap: 10
        System.out.println("Number of swap: " + swap2);
        // Before sorting: [5 4 3 2 1]
        // After sorting: [1 2 3 4 5]
        // Number of swap: 10


        int[] array3 = new int[5];
        for(int i = 0; i<array3.length; i++) {
            Random rand = new Random();
            int randomInt = rand.nextInt(100);
            array3[i] = randomInt;
        }
        System.out.println("Using Insertion Sort Algorithm:");
        System.out.print("Before sorting: [");
        for(int i = 0; i<array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("]");
        // Using Insertion Sort Algorithm:
        // Before sorting: [5 4 3 2 1]
        InsertionSort Isort = new InsertionSort();
        int swap3 = Isort.sort(array);
        // After sorting: [1 2 3 4 5]
        System.out.print("After sorting: [");
        for(int i = 0; i<array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("]");
        // Number of swap: 10
        System.out.println("Number of swap: " + swap3);

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.
    }
}
