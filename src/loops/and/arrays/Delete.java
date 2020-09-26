package loops.and.arrays;
//Write a program that will delete the array element of the given index.

import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(array));

        System.out.println("Please enter index to remove: ");

        int indexToRemove = scanner.nextInt();

        //Deleting
        int[] result = removeAtIndex(array, indexToRemove);
        System.out.println("After removing element at " + indexToRemove);
        System.out.println(Arrays.toString(result));

    }

    public static int[] removeAtIndex(int[] initialArray, int index) {

        int[] result = new int[initialArray.length - 1];
        for (int i = 0; i < index; ++i) {
            result[i] = initialArray[i];
        }

        for (int i = index + 1; i < initialArray.length; ++i) {
            result[i - 1] = initialArray[i];
        }

        return result;
    }

}




