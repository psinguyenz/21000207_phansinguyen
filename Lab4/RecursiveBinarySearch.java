public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int midIdx = (fromIdx + toIdx) / 2;
        if (array[midIdx] == key) {
            return true;
        } else if (array[midIdx] > key) {
            return binarySearch(array, key, fromIdx, midIdx - 1);
        } else {
            return binarySearch(array, key, midIdx + 1, toIdx);
        }
    }

    public static boolean binarySearch(int[] array, int key) {
        int fromIdx = 0;
        int toIdx = array.length - 1;
        int midIdx = (fromIdx + toIdx) / 2;
        if (array[midIdx] == key) {
            return true;
        } else if (array[midIdx] > key) {
            return binarySearch(array, key, fromIdx, midIdx - 1);
        } else {
            return binarySearch(array, key, midIdx + 1, toIdx);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int key = 5;
        int fromIdx = 0;
        int toIdx = array.length;
        System.out.println(binarySearch(array, key, fromIdx, toIdx));
        System.out.println(binarySearch(array, key));
    }
}