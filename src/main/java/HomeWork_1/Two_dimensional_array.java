package HomeWork_1;

public class Two_dimensional_array {
    public static void main(String[] args) {
        int[][] arrInt = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                if (arrInt[i][j] % 2 == 0) {
                    sum += arrInt[i][j];
                }
            }
        }
        System.out.println("Сумма элементов двумерного массива: " + sum);
    }

    public static int[] searchArray(int[][] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}







