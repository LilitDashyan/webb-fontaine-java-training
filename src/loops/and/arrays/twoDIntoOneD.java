package loops.and.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Represent the given two-dimensional array in the same sequence of a one-dimensional array.
public class twoDIntoOneD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter array size: ");

        int arraySize = scanner.nextInt();
        System.out.println("Please enter second size: ");
        int innerArraySize = scanner.nextInt();

        int[][] twoDArray = new int[arraySize][innerArraySize];
        for (int i = 0; i < arraySize; i++) {

            for (int j = 0; j < innerArraySize; j++) {
                twoDArray[i][j] = (int) ( Math.random() * 100 );
            }
            System.out.println(Arrays.toString(twoDArray[i]));
        }


        int[] oneDArray = new int[arraySize * innerArraySize];

        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < innerArraySize; j++) {
                oneDArray[i * innerArraySize + j] = twoDArray[i][j];
            }
        }
        System.out.println("\nResult array is\n");
        System.out.println(Arrays.toString(oneDArray));
    }
}