package loops.and.arrays;
//Write a program that will find and separate the repeating values of two given arrays.


import java.util.Scanner;

public class RepeatingValue {

    public static void main(String[] args) {
        System.out.println("Please input fist array");
        int[] first = intArrayFromUserInput(3);

        System.out.println("Please input second array");
        int[] second = intArrayFromUserInput(5);


//        int[] first = {1, 33, 5, 6, 66, 4};
//        int[] second = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < first.length; i++) {
            if (checkValueExistence(first[i], second)) {
                System.out.println(first[i]);
            }
        }
    }

    public static boolean checkValueExistence(int valueToCheck, int[] arrayToCheck) {
        for (int i = 0; i < arrayToCheck.length; i++) {
            if (valueToCheck == arrayToCheck[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] intArrayFromUserInput(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = scanner.nextInt();
        }
        return resultArray;
    }

}