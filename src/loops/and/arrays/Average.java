package loops.and.arrays;

import java.util.Scanner;
//Write a program that will calculate the arithmetic mean of array elements (type of elements: double, array size: 10).

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double[] array = new double[10];
        System.out.println("Enter 10 elements");

        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        double average = sum/array.length;
        System.out.println("Arithmetic mean of array is " + average);
    }
}