package HomeWork_1;

public class Replace_negative_values {
    public static void main(String[] args) {
        int[] arrInt = {-3, 5, -10, 15, -20, 25, -105};

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < 0) {
                arrInt[i] = 0;
            }
        }

        System.out.print("Массив после замены отрицательных значений на 0: ");
        for (int j : arrInt) {
            System.out.print(j + " ");
        }
    }
}
