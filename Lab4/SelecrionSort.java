public class SelecrionSort {
    public static void selection (int[] array) {
        StringBuilder sb = new StringBuilder();
        int[] array2 = new int[array.length];
        int count = 0;
        while (count<array.length) {
            int min = array[count];
            for (int i = count; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            for (int i = count; i < array.length; i++) {
                if (array[i] == min) {
                    int temp = array[count];
                    array[count] = array[i];
                    array2[count] = array[i];
                    array[i] = temp;
                }
            }
            count += 1;
        }
        for (int i = 0; i < array.length; i++) {
            sb.append(array2[i] + ",");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
    public static void main (String args[]) {
        int[] array = {9, 6, 4, 1, 5};
        selection(array);
    }
}
