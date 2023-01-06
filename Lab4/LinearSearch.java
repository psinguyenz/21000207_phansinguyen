public class LinearSearch {
    public static boolean linearSearch(int [] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int [] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = {0,1,2,3,4,5,6,7};
        if (linearSearch(array, 5) == true) {
            System.out.println(linearSearchIndex(array, 5));
        }
    }
}
