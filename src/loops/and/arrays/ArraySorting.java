package loops.and.arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Write a program that will sort the given mass in ascending and descending order. Use Math.random() method for initializing array elements.
public class ArraySorting {
    public static void main(String[] args) {
//        int[] array = intArrayFromUserInput(5);
        Integer[] array = generateRandomArray(5);
        System.out.println("Initial array is");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("After sorting in ascending");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("After sorting in descending order");
        System.out.println(Arrays.toString(array));
    }


    public static Integer[] intArrayFromUserInput(Integer arrayLength) {
        Integer[] resultArray = new Integer[arrayLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = scanner.nextInt();
        }
        return resultArray;
    }

    public static Integer[] generateRandomArray(int arrayLength) {
        Integer[] resultArray = new Integer[arrayLength];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (int) ( Math.random() * 100 );
        }
        return resultArray;
    }
}
    



