package LoopsAndArrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        System.out.println("Please enter array size to sort: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Integer [] myArray= new Integer[arraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) ( Math.random() * 100 );;
        }
        System.out.println("Current array");
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray, Collections.reverseOrder());


        System.out.println("After reverse sorting\n ");
        System.out.println(Arrays.toString(myArray));

    }
}
