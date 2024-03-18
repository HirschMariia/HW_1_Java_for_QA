package HomeWork_1;

public class Positive_elements_array {
        public static void main(String[] args) {
            int[] arrInt = {2, -3, 5, 7, -1, 0, 10};
            int result = 1;

            for (int i = 0; i < arrInt.length; i++) {
                if (arrInt[i] > 0) {
                    result *= arrInt[i];
                }
            }

            System.out.println("Произведение положительных элементов массива: " + result);
        }
    }


