package HomeWork_1;

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args) {
        int[][] array = {
                {5, 3, 8, 1},
                {9, 4, 2, 7},
                {6, 0, 12, 10}
        };

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted subarray " + (i + 1) + ": " + Arrays.toString(array[i]));
        }
    }
}
