package loops.and.arrays;

import java.util.Arrays;
import java.util.Scanner;
//Write a program that will convert the entered number into an array
public class IntIntoArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");

        Integer intVal = reader.nextInt();

        String stringVal = String.valueOf(intVal);

        char[] charArray = stringVal.toCharArray();

        String toPrint = Arrays.toString(charArray);

        System.out.println(toPrint);
    }

}