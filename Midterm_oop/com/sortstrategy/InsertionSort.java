package com.sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        /* TODO */
        int count = 0;
        for (int j = 1; j < data.length; j++) {
            int key = data[j];
            int i = j-1;
            while ((i > -1) && (data [i] > key)) {
                data [i+1] = data [i];
                i--;
            }
            data[i+1] = key;
            count += 1;
        }
        return count;
    }
}
