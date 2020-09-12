package LoopsAndArrays;

public class Contains {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2};
        int k = 2;
        for (int i = 0; i < array.length; ++i) {
            int counter = 0;
            for (int j = 0; j < array.length; ++j) {
                if (array[i] == array[j]) {
                    counter++;
                }
                if (counter > k-1) {
                    break;
                }

            }
            if (counter == k) {
                System.out.println("=" + array[i]);
            }

        }
    }
}
