package loops.and.arrays;
//Given 2 arrays, find an element in the first array that doesn’t occur in the second array.

import java.util.Scanner;

public class FindDiff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = 5;

        int[] array1 = new int[arraySize];
        int[] array2 = new int[arraySize];
        System.out.println("Enter element for 1st array:");
        for (int i = 0; i < arraySize; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter element for 2nd array: ");

        for (int j = 0; j < arraySize; ++j) {
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter int number: ");
                scanner.next();
            }
            array2[j] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("Extra element(s) in first array: " + array1[i]);


            }


        }
    }
}